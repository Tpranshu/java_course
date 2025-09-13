import java.util.*;

public class program53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        marks[3] = 99;
        marks[4] = 100;
        boolean flag = true;
        while (flag) {

            System.out.println();
            System.out.println("Enter the index of the array you want to access the marks");
            int index = sc.nextInt();
            try {
                System.out.println("welcome to the code");
                try {
                    System.out.println(marks[index]);
                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index is out of bounds");
                    System.out.println("Exception occured in the nested try block");
                }
            } catch (Exception e) {
                System.out.println("Exception occured in the try block");

            }
        }
        System.out.println("Thanks for using the code");
    }
}
