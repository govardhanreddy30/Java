public class ArrayExample {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[10] = 50;   // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}