import java.util.*;

public class program3 {
    public static void main(String[] args) {
        // string
        /*
         * string eak function hota hai java me
         * string premitive datatypes nhi hote hai per ye java me premetive datatypes
         * normal datatypes ki tarah bhi use kr skte hai.
         * same as scanner class and their object ki tarah hi string class aur object
         * hote hai java me.
         */
        String name = new String("pranshu");
        System.out.println(name);
        /*
         * strings are immutuable and cannot be change it.
         * but we can change string after making their copy string object.
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        // String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);

    }
}
