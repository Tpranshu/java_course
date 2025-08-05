
interface base_1 {
    void method1();

    void method2();

}

interface derived_1 extends base_1 {
    void method3();

    void method4();

}

class pranshu implements derived_1 {
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public void method3() {
        System.out.println("method3");
    }

    public void method4() {
        System.out.println("method4");
    }

}

public class program36 {
    public static void main(String[] args) {
        // Inheritance in Interfaces
        // Inheritance in interfaces in Java refers to the concept where one interface can inherit (or extend) another interface. This allows the child interface to inherit all the abstract methods of the parent interface, promoting reusability and modularity in code design.
        
        pranshu p = new pranshu();
        System.out.println("\n");
        p.method1();
        p.method2();
        p.method3();
        p.method4();

    }
}
