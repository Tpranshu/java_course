public class program6 {
    public static void main(String[] args) {
        // logial AND operator --> both condition should be true or false
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\n");
        // logial OR operator --> only one condtion should be true or false
        if (a || b) {
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
        
        System.out.println("\n");
        // NOT operator
        int a1 = 2;
        if (a1!=6) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
