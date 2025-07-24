import java.util.*;

public class program12 {
    public static void main(String[] args) {
        // array
        /*
         * array is a collection of similiar type of data types and array start with 0
         * index number in an array.
         * array is an object in java.
         */

        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 102;
        arr[4] = 120;
        System.out.println("\n");
        System.out.println(arr[4]);

        int[] arr1 = { 12, 15, 18, 20, 25 };
        float[] arr2 = { 12.1f, 15.2f, 18.5f, 20.6f, 25.8f };
        String[] arr3 = { "pranshu", "tiwari" };

        System.out.println(arr1[4]);
        // System.out.println(arr1.length);

        System.out.println(arr2[4]);
        // System.out.println(arr2.length);

        System.out.println(arr3[0]);
        // System.out.println(arr3.length);

        // print array element using for loop
        System.out.println("\n");
        for(int i = 0;i<=arr1.length;i++){
            System.out.println(arr1[i]);
        }

        // print array element in reverse order  
        // for(int i=arr1.length - 1 ; i>=0; i--){
        
        //     System.out.println(arr1[i]);
        // }

        // for-each loop
        System.out.println("print array element using for-each loop");
        for(int element: arr1){
            System.out.println(element);
        }




    }
}
