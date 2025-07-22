import java.util.*;
public class program10 {
    public static void main(String[] args) {
        // for loop
        System.out.println("\n");
        for(int i = 1; i<=10 ; i++){
            System.out.println(i);
        }

        // wap to print first n odd numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 1; i<n;i++){
            if ( i%2 != 0) {
               System.out.println(i);
            }
        }

        // decrementing for loop
        System.out.println("\n");
        for(int i = 10;i>=0;i--){
            System.out.println(i);
        }

    }
}
