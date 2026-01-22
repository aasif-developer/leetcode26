import java.util.Scanner;
public class PalindromeNumber
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int temp = x;
        int rev = 0;
        if (x < 0)
        {
            System.out.println("Not a Palindrome");
        }
        else
        {
            while (x > 0)
            {
                rev = rev * 10 + (x % 10);
                x = x / 10;
            }
            if (temp == rev)
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
/* EXPLANATION :
1. We take a number as input from the user.
2. We store the original number in a temporary variable.
3. If the number is negative, it cannot be a palindrome.
4. We reverse the number using a while loop.
5. We compare the reversed number with the original number.
6. If both are equal, the number is a palindrome, otherwise it is not.
*/
