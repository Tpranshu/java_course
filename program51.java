interface A{
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
    
}
class my_class implements B{
    public void meth1(){
        System.out.println("method 1 is called ");
        
    }
    
    public void meth2(){
        System.out.println("method 2 is called ");
        
    }
    
    public void meth3(){
        System.out.println("method 3 is called ");
        
    }
}
class program51 {
    public static void main(String[] args) {
        my_class ob = new my_class();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}