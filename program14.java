public class program14 {
    public static void main(String[] args) {
        //questions
        
        float[] arr = { 10.1f, 20.2f, 30.3f, 40.4f, 50.5f };
        float sum = 0;
        System.out.println("/n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("the total sum is " + sum);

        int[] array = { 10, 20, 30, 40, 50 };
        int num = 20;
        boolean IsPresent = false;
        System.out.println("/n");
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                IsPresent = true;
                break;
            }

        }
        if (IsPresent) {
            System.out.println("the element is present in array");

        } else {
            System.out.println("the element is not present in array");
        }

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int sum1 = 0;
        System.out.println("/n");
        for (int element : arr1) {
            sum1 = sum1 + element;
        }
        System.out.println("The average is " + (sum1 / arr1.length));

        int[][] matrix_1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix_2 = { { 7, 8, 9 }, { 10, 11, 12 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
        System.out.println("\n");
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[i].length; j++) {
                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        System.out.println("The result matrix is ");
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[i].length; j++) {
                System.out.print(" " + result[i][j]);
                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
            System.out.println("\n");
        }

        int[] arr_1 = { 10, 20, 30, 40, 50 };
        System.out.println("Reverse order array");
        for (int i = arr_1.length - 1; i >= 0; i--) {
            System.out.println(arr_1[i]);
        }

    }

}
