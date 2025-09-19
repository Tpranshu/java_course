public class program57 {
    public static void main(String[] args) {
        System.out.println();
        try {
            System.out.println("Inside try block");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block. Exiting program...");
            System.exit(0);
        }

        System.out.println("This line will not be printed.");

        /*
         * System.exit() is a method in Java used to stop the program immediately.
         * System.exit(0) → Stops the program normally (no error).
           System.exit(1) or any non-zero → Stops the program with an error code (used to show something went wrong).
         */
        
    }
}
