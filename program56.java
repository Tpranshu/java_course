
class mclass {
    static void nesttry(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);
            }
            if (a == 2) {
                int c[] = { 1 };
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array bounds " + e);

        }
    }
}

class program56 {
    public static void main(String[] args) {
        System.out.println();
        try {
            int a = 0;
            int b = 42 / 0;
            mclass.nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("divided by zero " + e);

        }
    }
}
