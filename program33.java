
interface game {
    int a = 10; // final property

    void fire(); // abstract methods

    void drive(); // abstract methods

}

class player implements game {
    public void fire() {
        System.out.println("player shoot the enemy");
    }

    public void drive() {
        System.out.println("player drive");
    }

}

class player2 implements game {
    public void fire() {
        System.out.println("player2 shoot the enemy");
    }

    public void drive() {
        System.out.println("player 2 drive");
    }

}
/*
 * All abstract methods in an interface must be implemented in the class that
 * implements the interface
 */

public class program33 {
    public static void main(String[] args) {
        // interfaces in java
        // In Java, an interface is a reference type, similar to a class, that is used
        // to define a contract that other classes must follow. It is a collection of
        // abstract methods (methods without a body) and constants. A class that
        // implements an interface agrees to provide implementations for all of its
        // methods.
        // game a = new game(); // we cannot create an object of interface beacause
        // interface is not a class.

        player p = new player();
        player2 p2 = new player2();
        System.out.println("\n");
        p.fire();
        p.drive();

        p2.fire();
        p2.drive();
        
        // p.a= 100;  // we cannot modify property of interface because they are default final property.

        System.out.println(p.a);
        System.out.println(p2.a);

        /*
         * output --
         * player shoot the enemy
         * player drive
         * player2 shoot the enemy
         * player 2 drive
         * 10
         * 10
         * 
         */
    }
}
