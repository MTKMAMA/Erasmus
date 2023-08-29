 public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Numero di elementi della sequenza da generare

        System.out.println("Sequenza di Fibonacci con " + n + " elementi:");
        for (int i = 0; i < n; i++) {
            int fibonacciNumber = fibonacci(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0;
        int prev2 = 1;
        int fibonacciNumber = 0;

        for (int i = 2; i <= n; i++) {
            fibonacciNumber = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibonacciNumber;
        }

        return fibonacciNumber;
    }
}