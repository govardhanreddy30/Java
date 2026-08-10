import java.util.Scanner;
public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("*");
        char ch = sc.next().charAt(0);
        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Columns: ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }
}