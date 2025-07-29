
class Emplyoee1 {
    int salary;
    int ID;
    String name;

    public Emplyoee1() {
        // default
        salary = 1000000;
        ID = 1;
        name = "pranshu tiwari";
    }

    public Emplyoee1(int x, String n, int y) {
        salary = x;
        name = n;
        ID = y;
        System.out.println(salary);
        System.out.println(name);
        System.out.println(ID);
    }

    public Emplyoee1(int x, String n) {
        salary = x;
        name = n;
        System.out.println(salary);
        System.out.println(name);

    }

    public Emplyoee1(int x) {
        salary = x;
        System.out.println(salary);

    }
    public Emplyoee1(String x) {
        name = x;
        System.out.println(name);

    }

}

public class program24 {
    public static void main(String[] args) {
        // constructor
        System.out.println("\n");
        // System.out.println("Constructor overloading");
        // Emplyoee1 pranshu = new Emplyoee1();
        Emplyoee1 pranshu = new Emplyoee1(12);
        // Emplyoee1 pranshu = new Emplyoee1(200000);
        // Emplyoee1 pranshu = new Emplyoee1("coder");

        // System.out.println("\n");
        // System.out.println("constuctor");
        // System.out.println(pranshu.ID = 10);
        // System.out.println(pranshu.salary = 1000000);
        // System.out.println(pranshu.name = "pranshu tiwari");

    }
}
