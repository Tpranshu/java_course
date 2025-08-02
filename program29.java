
class base {
    int x;

    base() {
        System.out.println("constructor of base class");
    }

    base(int a) {
        System.out.println("constructor of base class " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class derived extends base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    derived() {
        super(10);
        // The super() call is used to invoke the parent class constructor (with or
        // without parameters) to initialize inherited attributes.
        // If a subclass has a variable with the same name as the parent class, super
        // can be used to refer specifically to the parent’s version.

        System.out.println("constructor of derived class");
    }

    derived(int a, int b) {
        super(a);
        System.out.println("constructor of derived class " + b);
    }

}

public class program29 {
    public static void main(String[] args) {
        // constructor in heritance
        System.out.println("\n");
        // base b = new base();
        // derived d = new derived();
        // when we create an object of derived class then it is run their base class
        // constructor and also run their itself constructor.

        // base b = new base();
        derived d = new derived(100, 200);


    }
}
