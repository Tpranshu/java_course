
class Base {
    int a;

    void setData_base(int x) {
        System.out.println("This is a base class");
        a = x;
    }

    int getData_base() {
        return a;
    }
}

class Derived extends Base {
    int b;

    void setData_derived(int y) {
        System.out.println("This is a derived class");
        b = y;
    }

    int getData_derived() {
        return b;
    }
}

public class program26 {
    public static void main(String[] args) {
        // Inheritance

        // Inheritance in Java is a mechanism in which one class acquires (inherits) the
        // properties and behaviors (fields and methods) of another class. It allows
        // code reusability and establishes a parent-child relationship between classes.
        

        Base pranshu = new Base();
        Derived tiwari = new Derived();
        System.out.println("\n");
        pranshu.setData_base(10);
        System.out.println(pranshu.getData_base());

        tiwari.setData_base(20);
        System.out.println(tiwari.getData_base());

        System.out.println("\n");
        tiwari.setData_derived(100);
        System.out.println(tiwari.getData_derived());

        // pranshu.setData_derived(0);
        // System.out.println(pranshu.getData_derived());
        // we cannot access derived class elemnt from base class using inheritance but
        // we can use and access the base class element from the derived class.

    }
}
