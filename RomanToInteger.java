package leetcode26;
import java.util.Scanner;
public class RomanToInteger {
    static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Numeral: ");
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            if (i + 1 < s.length() && curr < value(s.charAt(i + 1))) {
                ans = ans - curr;
            } else {
                ans = ans + curr;
            }
        }
        System.out.println("Integer Value: " + ans);
        sc.close();
    }
}
