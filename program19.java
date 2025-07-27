public class program19 {

    static void multiplication_table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void reverse_pattern(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int natural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static int natural_recursive(int n) {
        int sum = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            sum = n + natural_recursive(n - 1);
            return sum;
        }
    }

    static int Fibonacci_series_recursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci_series_recursion(n - 1) + Fibonacci_series_recursion(n - 2);
        }
    }

    static int index(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return index(n - 1) + index(n - 2);
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("\n");
        multiplication_table(x);
        pattern(x);
        System.out.println("the sum of natural number is " + natural(x));
        System.out.println("the sum of natural number is " + natural_recursive(x));
        reverse_pattern(x);

        for (int i = 0; i < x; i++) {
            System.out.print(Fibonacci_series_recursion(i) + " ");
        }
        System.out.println("\n");
        System.out.println("the index of Fibonacci_series_recursion() method is " + index(x));
    }
}
