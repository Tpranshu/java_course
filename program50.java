abstract class A{
    abstract void first();
    void second(){
        
        System.out.println("Abstract concept");
    }
}
class B extends A{
    void first(){
        
        System.out.println("first method in abstract class ");
    }
}
class program50 {
    public static void main(String[] args) {
       B b1 = new B();
       b1.first();
       b1.second();
    }
}