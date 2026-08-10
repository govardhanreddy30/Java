import java.util.*;

public class DecimalConvert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + Integer.toBinaryString(n));
        System.out.println("Octal = " + Integer.toOctalString(n));
    }
}