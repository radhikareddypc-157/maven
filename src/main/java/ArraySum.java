public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for (int n : arr) {
            sum = sum + n;
        }

        System.out.println("Array sum = " + sum);
    }
}