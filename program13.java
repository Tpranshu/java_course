import java.util.*;

public class program13 {
    public static void main(String[] args) {
        // multidimensional array
        // 2-D dimensional array
        int[][] arr = new int[2][3];
        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[0][2] = 300;
        arr[1][0] = 400;
        arr[1][1] = 500;
        arr[1][2] = 600;
        // System.out.println(arr.length);

        /*
         * first [] --> rows
         * second [] --> columns
         * 
         *  TABLE-----
         * 
         *  |-----------------|---------------------------- ------------------|--------------------| 
         *  | Expression      | Meaning                                       | Value in your code |
            | --------------- | --------------------------------------------- | ------------------ |
            | `arr.length`    | Number of rows (outer array size)             | `2`                |
            | `arr[0].length` | Number of columns in row 0 (inner array size) | `3`                |
            | `arr[1].length` | Number of columns in row 1                    | `3`                |
            |--------------------------------------------------------------------------------------|
            
         */
    
        // access 2-D array element
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
              
            }
            System.out.println("\n");
        }

    }
}
