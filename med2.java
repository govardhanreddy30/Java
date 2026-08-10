import java.util.*;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        System.out.print("Enter N: ");
        int k = sc.nextInt();

        if (m <= 0 || m > n || k <= 0 || k > n) {
            System.out.println("Invalid Position");
            return;
        }

        int max = arr[n - m];
        int min = arr[k - 1];

        System.out.println(m + " Maximum = " + max);
        System.out.println(k + " Minimum = " + min);
        System.out.println("Sum = " + (max + min));
        System.out.println("Difference = " + (max - min));
    }
}