
interface game {
    int a = 10;

    void fire();

    void drive();

}

interface check {


    void online();

    void offline();

}

class player implements game, check {
    public void fire() {
        System.out.println("player shoot the enemy");
    }

    public void drive() {
        System.out.println("player drive");
    }

    public void online() {
        System.out.println("player is online");
    }

    public void offline() {
        System.out.println("player is offline");
    }

}

class player2 implements game,check {
    public void fire() {
        System.out.println("player2 shoot the enemy");
    }

    public void drive() {
        System.out.println("player 2 drive");
    }
     public void online() {
        System.out.println("player2 is online");
    }

    public void offline() {
        System.out.println("player2 is offline");
    }

}

public class program34 {
    public static void main(String[] args) {
        player p = new player();
        player2 p2 = new player2();
        System.out.println("\n");
        p.online();
        p.offline();
    
        p2.online();
        p2.offline();
    }
}
