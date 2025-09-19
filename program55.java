public class program55 {
    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("In try");
            int data = 25 / 0; // may throw exception
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println();
            System.out.println("In finally");
        }
    }
}
