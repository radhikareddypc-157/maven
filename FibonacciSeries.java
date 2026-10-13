public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(" ");
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }
}