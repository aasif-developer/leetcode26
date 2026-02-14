
import java.util.Scanner;
public class FirstOccurrence {
    public static int strStr(String a, String b) {
        if (b.length() == 0)
            return 0;
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int j = 0;
            while (j < b.length() && a.charAt(i + j) == b.charAt(j))
            {
                j++;
            }
            if (j == b.length())
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String a= sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String b = sc.nextLine();
        int index = strStr(a, b);
        System.out.println("First occurrence index: " + index);
        sc.close();
    }
}
