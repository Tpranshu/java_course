
interface enemey_1 {
    void pickup_gun();

    void fire();

    default void auto_fire() {
        System.out.println("auto fire is on");
    }
}

interface recall_1 {
    String[] recall_teammate();

    void revive(String revive);
}

class check_player_1 {
    void online() {
        System.out.println("\nplayer is online");
    }

    void offline() {
        System.out.println("\nplayer is not online");
    }

}

class new_player_1 extends check_player_1 implements enemey_1, recall_1 {
    public void pickup_gun() {
        System.out.println("\npickup the gun and shoot the enemy");
    }

    public void fire() {
        System.out.println("\njust shoot the enemy");

    }

    public String[] recall_teammate() {
        System.out.println("\nrecalling the teammate");
        String[] team_mates = { "pranshu", "aman" };
        return team_mates;
    }

    public void revive(String revive) {
        System.out.println("\nteamamte are revived " + revive);
    }

    public void auto_fire() {
        System.out.println("auto fire on the enemy");
    }

    public void sample() {
        System.out.println("sample");
    }

}

public class program37 {
    public static void main(String[] args) {
        // Polymorphism in Interfaces
        enemey_1 p = new new_player_1();
        // p.recall_teammate(); // this is an object of new_player_1 but can only use it
        // as a enemy_1.
        // p.sample();

        p.pickup_gun();
        p.fire();
        p.auto_fire();

        // new_player_1 p1 = new new_player_1(); // this is an object of new_player_1 and it is access all the methods.
        // String[] arr = p1.recall_teammate();
        // // System.out.println("\n");
        // for (String item : arr) {
        //     System.out.println(item);
        // }
        // // p1.auto_fire();
        // p1.pickup_gun();
        // p1.fire();
        // p1.recall_teammate();
        // p1.revive("pranshu");
        // p1.online();
        // p1.offline();

    }
}
