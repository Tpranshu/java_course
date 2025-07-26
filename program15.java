public class program15 {
    static int add(int x, int y) {
        int z = 0;

       
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 2;
        }
     
        return z;
    }

    public static void main(String[] args) {
        /*
         * A method is a function written inside a class in java.
         * 
         */
        int a = 12;
        int b = 15;
        int c = add(a, b);
        
        System.out.println("\n");
        System.out.println(c);
        /*
         * the original value of a and b are doesn't change.
         */
    }
}
