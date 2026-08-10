import java.util.*;

public class PalindromeChoice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.String");
        System.out.println("2.Number");

        int ch = sc.nextInt();

        switch (ch) {

            case 1:

                String s = sc.next();
                String rev = "";

                for (int i = s.length() - 1; i >= 0; i--)
                    rev += s.charAt(i);

                if (s.equalsIgnoreCase(rev))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");

                break;

            case 2:

                int n = sc.nextInt();
                int temp = n, revNum = 0;

                while (n > 0) {
                    revNum = revNum * 10 + n % 10;
                    n /= 10;
                }

                if (temp == revNum)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");

                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}