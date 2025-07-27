public class program18 {

    // recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // iterative
    static int iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    }

    // Fibonacci Series in Java
    static void Fibonacci_series(int n) {
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int result = first + second;
            first = second;
            second = result;

        }

    }

    // Fibonacci Series in Java using recursion
    static int Fibonacci_series_recursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci_series_recursion(n - 1) + Fibonacci_series_recursion(n - 2);
        }
    }

    public static void main(String[] args) {
        // Recursion
        int x = 9;
        System.out.println("\n");
        System.out.println("The factorial of x variable is " + factorial(x));
        System.out.println("The factorial of x variable is " + iterative(x));
        Fibonacci_series(x);
        System.out.println("\n");
        for (int i = 0; i < x; i++) {
            System.out.print(Fibonacci_series_recursion(i) + " ");
        }

    }
}
