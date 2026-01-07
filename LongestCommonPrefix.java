import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) {
                    System.out.println("Longest Common Prefix: ");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("Longest Common Prefix: " + prefix);
        sc.close();
    }
}
