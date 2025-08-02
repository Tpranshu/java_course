
class hello{
    int a;

    public int getA() {
        return a;
    }
    hello(int a){
        this.a=a;
         System.out.println("\nThis is a base class ");
    }

}
class hii extends hello{
    hii(int x){
        super(x);
        System.out.println("\nThis is a derived class ");
    }
}
public class program28 {
    public static void main(String[] args) {
        // this and super keyword --
        // The this keyword refers to the current instance of the class.
        // The super keyword refers to the parent (superclass) of the current object.

        hello pranshu = new hello(10);
        hii tiwari = new hii(20);
        System.out.println("\n");
        System.out.println(pranshu.getA());
        System.out.println(tiwari.getA());

    }
}
