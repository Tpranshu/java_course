public class program54 {
    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("In try");
            System.exit(0);
        } finally {
            System.out.println();
            System.out.println("In finally");
        }
    }

}

// The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
