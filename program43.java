
class access {
    public int x = 1;
    protected int y = 2;
    private int z = 3;
    int a = 4;

    void get() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class new_access extends access {

    void get1() {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        System.out.println(a);
    }
    
}

public class program43 {
    public static void main(String[] args) {
        access ac = new access();
        new_access na = new new_access();
        System.out.println();
        // class access modifier --
        // ac.get();
        
        // package access modifier --
        // System.out.println(ac.x);
        // System.out.println(ac.y);
        // System.out.println(ac.z);
        // System.out.println(ac.a);

        // subclass access modifier --
        // System.out.println(na.x);
        // System.out.println(na.y);
        // // System.out.println(na.z);
        // System.out.println(na.a);
        na.get1();

        
    }
}
