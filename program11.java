public class program11 {
    public static void main(String[] args) {
        // break and continue

        // The break statement is used to exit or terminate the current loop
        // statement immediately.
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }

        }

        // The continue statement is used to skip the current iteration of a loop and
        // move to the next iteration.
        System.out.println("\n");
        for (int i = 0; i <= 50; i++) {
            if (i == 4) {
                continue;
            }

            System.out.println(i);
        }

    }
}
