
interface enemey {
    void pickup_gun();

    void fire();

    default void auto_fire() {
        System.out.println("auto fire is on");
    }
}

interface recall {
    String[] recall_teammate();

    void revive(String revive);
}

class check_player {
    void online() {
        System.out.println("\nplayer is online");
    }

    void offline() {
        System.out.println("\nplayer is not online");
    }

}

class new_player extends check_player implements enemey, recall {
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

}

public class program35 {
    public static void main(String[] args) {
        new_player p1 = new new_player();
        String[] arr = p1.recall_teammate();
        // System.out.println("\n");
        for (String item : arr) {
            System.out.println(item);
        }
        // p1.auto_fire();
        p1.pickup_gun();
        p1.fire();
        p1.recall_teammate();
        p1.revive("pranshu");
        p1.online();
        p1.offline();
        /*
         * output --
         * recalling the teammate
         * pranshu
         * aman
         * 
         * pickup the gun and shoot the enemy
         * 
         * just shoot the enemy
         * 
         * recalling the teammate
         * 
         * teamamte are revived pranshu
         * 
         * player is online
         * 
         * player is not online
         * 
         */

    }
}
