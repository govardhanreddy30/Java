import java.util.Scanner;

public class PTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int j = i; j < n - 1; j++)
                System.out.print("  ");

            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}