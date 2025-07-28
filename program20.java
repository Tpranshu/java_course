import java.util.*;


class Student{
    int id;  // attributes or property
    String name;  // attributes or property
    public void get(){  // methods
        System.out.println("ID is " + id);
        System.out.println("Name is " + name);
    }
}
public class program20 {
        public static void main(String[] args) {
        // oops
        Student pranshu = new Student();  // creating an object from class
        Student aman = new Student();  // creating an object from class

        System.out.println("\n");
        pranshu.id = 10;
        pranshu.name = "abcd";
 
        aman.id = 20;
        aman.name = "efgh";

        pranshu.get();
        aman.get();
    }
}
