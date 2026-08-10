import java.util.*;

public class med1 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prime = 0, composite = 0;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > 1) {
                if (isPrime(num))
                    prime++;
                else
                    composite++;
            }
        }

        System.out.println("Composite number: " + composite);
        System.out.println("Prime number: " + prime);
    }
}