import java.util.*;

public class program38 {
    public static void main(String[] args) {
        System.out.println("\nmatrix");
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int dsum = 0;
        int dsum2 = 0;
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the array element ");
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

        System.out.println("diagonal sum of the array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // dsum = 0;
                if (i == j) {
                    dsum = dsum + arr[i][j];

                }

            }

        }
        System.out.print(dsum);

        System.out.println(" \nright diagonal sum of the array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // dsum = 0;
                if ((i + j) == 2) {
                    dsum2 = dsum2 + arr[i][j];

                }

            }

        }
        System.out.print(dsum);

        /*
         * output --
         * matrix
         * 
         * 
         * Enter the array element
         * 1
         * Enter the array element
         * 2
         * Enter the array element
         * 3
         * Enter the array element
         * 4
         * Enter the array element
         * 5
         * Enter the array element
         * 6
         * Enter the array element
         * 7
         * Enter the array element
         * 8
         * Enter the array element
         * 9
         * printing the array
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * diagonal sum of the array
         * 15
         * right diagonal sum of the array
         * 15
         * 
         */

    }
}
