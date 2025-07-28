
class Employee {
    int salary;
    String name;

    public void setSalary(int x) {
        System.out.print("salary ");
        salary = x;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        System.out.print("name ");
        name = n;
    }

    public String getName() {
        return name;
    }

}

class circle {
    float radius;

    public float area(float x) {
        radius = x;
        float result = (3.14f * radius * radius);
        return result;
    }

   

}

public class program21 {
    public static void main(String[] args) {

        Employee pranshu = new Employee();
        circle aman = new circle();
        System.out.println("\n");

        pranshu.setSalary(10000000);
        System.out.println(pranshu.getSalary());

        pranshu.setName("pranshu tiwari");
        System.out.println(pranshu.getName());

        System.out.println("\n");
        System.out.println("area of circle is " + aman.area(4.0f));

    }
}
