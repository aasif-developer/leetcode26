import java.util.Scanner;

public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null)
            curr.next = list1;
        else
            curr.next = list2;

        return dummy.next;
    }

    public static ListNode createList(int n, Scanner sc) {

        if (n == 0)
            return null;

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in list1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter elements of list1: ");
        ListNode list1 = createList(n1, sc);

        System.out.print("Enter number of elements in list2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter elements of list2: ");
        ListNode list2 = createList(n2, sc);

        ListNode result = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(result);

        sc.close();
    }
}
