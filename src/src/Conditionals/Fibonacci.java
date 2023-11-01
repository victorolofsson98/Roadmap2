package Conditionals;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of iterations

        System.out.println("Fibonacci");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\nFibonacci Interative");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciInterative(i) + " ");
        }

    }

    // recursive, meaning repeating the same thing over again, slow approach.
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // iterative, faster approach.
    public static int fibonacciInterative(int x) {
        if (x <= 1) {
            return x;
        }

        int fib = 0;
        int prev1 = 0;
        int prev2 = 1;

        for (int i = 2; i <= x; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }

        return fib;
    }

}
