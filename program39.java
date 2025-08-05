import java.util.*;

public class program39 {
    public static void main(String[] args) {
        System.out.println("\naddition of 2 matrix");
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println("Enter the matrix 1 element ");
                arr[i][j] = sc.nextInt();

            }

        }
        System.out.println("printing the array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println("Enter the matrix 2 element ");
                arr2[i][j] = sc.nextInt();

            }

        }
        System.out.println("printing the array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");

            }
            System.out.print("\n");
        }

        System.out.println("\n adding both the array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((arr[i][j] + arr2[i][j]) + " ");

            }
            System.out.print("\n");
        }
        /*
         * output --
         * addition of 2 matrix
         * 
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * printing the array
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * printing the array
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         * adding both the array
         * 2 4 6
         * 8 10 12
         * 14 16 18
         * 
         */
    }
}
