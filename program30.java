
class phone {
    void time() {
        System.out.println("Time");

    }

    void on() {
        System.out.println("Phone is turnning on ");
    }
}

class smartphone extends phone {
    void music() {
        System.out.println("music");

    }

    void on() {
        System.out.println("Phone is turnning on ");
    }
}

public class program30 {
    public static void main(String[] args) {
        // Dynamic Method Dispatch in Java
        phone a = new smartphone();
        // a is an object of smartphone class not phone(base) class.
        System.out.println("\n");
        a.time();
        a.on();
        // execute on() of smartphone.

        // a.music(); // it gives error because it is not allowed in java.

        /*
         * output --
         * Time
         * Phone is turnning on
         * 
         */
    }
}
