
class mythread extends Thread{
    public mythread(String name){
        super(name);
        System.out.println(name);
    }
    public void run(){
        System.out.println("thread");
    }
}
public class program46 {
    public static void main(String[] args) {
        System.out.println();
        mythread m = new mythread("pranshu tiwari");
        m.start();
     

    }
}
