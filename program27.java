
class student {
    void greet() {
        System.out.println("hello good morning");
    }

    student() {
        System.out.println("This is a student(base) class");
    }
}

class teacher extends student {
    void hello() {
        System.out.println("hello");
    }

    teacher() {
        System.out.println("This is a teacher(derived) class");
    }

}

public class program27 {
    public static void main(String[] args) {
        // method overloading
        student s = new student();
        teacher t = new teacher();

        System.out.println("\n");
        s.greet();
        t.hello();
    }
}
