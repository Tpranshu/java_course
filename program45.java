
class ThreadRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("ThreadRunnable");

        }
    }

}

class ThreadRunnable1 implements Runnable {

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("ThreadRunnable1");

        }
    }

}

public class program45 {
    public static void main(String[] args) {
        ThreadRunnable th = new ThreadRunnable();
        Thread obj = new Thread(th);

        ThreadRunnable1 th1 = new ThreadRunnable1();
        Thread obj1 = new Thread(th1);

        System.out.println();
        obj.start();
        obj1.start();

    }
}
