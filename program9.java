import java.util.*;
public class program9 {
    public static void main(String[] args) {
        // do while loop
        // do while loop execite at least one time where condition is true or false.
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.println("\n");
        do {
            System.out.println(a);
            a++;
        } while (a<10);
        
        
        System.out.println("\n");
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int a1 = 1;
        do {
            System.out.println(a1);
            a1++;
        } while (a1<n);


    }
}
