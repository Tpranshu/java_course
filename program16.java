public class program16 {

    static void greeting() {
        System.out.println("Good morning");
    }

    static void change_value(int x) {
        x = 100;

    }

    static int change_value_int(int x1) {
        x1 = 100;
        return x1;

    }

    static void change_value_arr(int[] arr) {
        arr[0] = 200;

    }

    static void method_overloading() {
        System.out.println("method overloading");

    }

    static void method_overloading(int x) {
        System.out.println("method overloading " + x);

    }
    static void method_overloading(int x, int y) {
        // (int x, int y) it is called parameters
        
        System.out.println("method overloading " + x + " "+ y);

    }

    public static void main(String[] args) {
        System.out.println("\n");
        greeting();

        // void return type --> this method does not return any value.
        // static keyword --> it is a class which run without creation object of their
        // class
        // and doesn't need object

        int a = 20;
        change_value(a);
        System.out.println(a);

        change_value_int(a);
        System.out.println(a);
        // the original value of a variable does not change beacuse the copy of a
        // variable are pass to the method.

        // array case--
        int[] array = { 12, 25, 56, 78, 90 };
        change_value_arr(array);
        System.out.println(array[0]);
        // the value of array[0] (o - index) are change because array contain references
        // of their element ,if we pass array in method argument then also pass their
        // copy reference(address) to the method hence this is a reason.

        // method ovrloading
        // same method name but different arguments.
        method_overloading();
        method_overloading(10);
        method_overloading(101,102); // (101,102) it is called arguments.

    }
}
