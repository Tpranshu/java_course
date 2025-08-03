
abstract class base{
    base(){
        System.out.println("base class");
    }
    void pranshu(){
        System.out.println("pranshu tiwari");
    }
    abstract void greet();
}
 
class derived extends base{
    void greet(){
        System.out.println("good morning");
    }
  

 }


public class program32 {
    public static void main(String[] args) {
        // Abstract Class & Abstract Methods
        // base b = new base();
        // we cannot create an object of abstract class but we can create their derived class object if they define abstract method from base class.

        derived d = new derived();
        d.greet();


    }
}
