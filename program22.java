
class Employee {
    private int salary;
    private String name;

    public void setSalary(int x) {

        salary = x;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {

        name = n;
    }

    public String getName() {
        return name;
    }

}

public class program22 {

    public static void main(String[] args) {
        // private access modifier
        // In Java, the private access modifier means the member is not accessible from outside the class, not even from subclasses or other classes in the same package.

        System.out.println("\n");
        Employee pranshu = new Employee();
       
        pranshu.setName("null");
        System.out.println(pranshu.getName());

        pranshu.setSalary(1000000);
        System.out.println(pranshu.getSalary());
        
    }
}
