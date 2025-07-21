import java.util.*;

public class program7 {
    public static void main(String[] args) {
        // nested if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        if (a > 18) {
            System.out.println("you can drive a car");
        } else if (a > 15) {
            System.out.println("you cannot drive a car");
        } else if (a > 10) {
            System.out.println("Don't even think about driving the car.");
        } else {
            System.out.println("you are a kid");
        }

        // switch case
        /*
         * var can be integer, character or string in java.
         * a switch can occur within another but in practice this is rarely done.
         */
        char var = 'p';
        switch (var) {
            case 'p':
                System.out.println("you are pranshu");
                break;

            case 't':
                System.out.println("you are tiwari");
                break;

            default:
                System.out.println("you are not pranshu tiwari");
                break;
        }

        // enhanced switch
        /*
         * there is no need to write break keyword in enhanced switch statement.
         */
        /*
         * public class SwitchDemo {
    public static void main(String[] args) {
        String color = "GREEN";


        int code;
        switch (color) {
            case "RED":
                code = 1;
                break;
            case "GREEN":
                code = 2;
                break;
            case "BLUE":
                code = 3;
                break;
            default:
                code = 0;
        }
        System.out.println("Traditional switch code: " + code);

        
        int enhancedCode = switch (color) {
            case "RED"   -> 1;
            case "GREEN" -> 2;
            case "BLUE"  -> 3;
            default      -> 0;
        };
        System.out.println("Enhanced switch code: " + enhancedCode);
    }
}

 */
       
    }
}
