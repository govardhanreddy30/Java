import java.util.*;

public class ATMBalance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 4; i++) {

            System.out.print("Enter Denomination: ");
            int d = sc.nextInt();

            if (d != 2000 && d != 500 && d != 200 && d != 100) {
                System.out.println("Invalid Denomination");
                return;
            }

            System.out.print("Enter Notes: ");
            int notes = sc.nextInt();

            total += d * notes;
        }

        System.out.println("Total Available Balance in ATM: " + total);
    }
}