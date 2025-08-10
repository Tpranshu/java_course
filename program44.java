import java.util.*;

class thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 2000) {
            System.out.println("thread1 is running");
            i++;
        }
    }

}

class thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 2000) {
            System.out.println("thread2 is running");
            i++;
        }
    }

}

public class program44 {
    public static void main(String[] args) {
        // thread class --
        // Thread class is used to create and manage threads in Java.
        // Helps you run multiple tasks concurrently or in parallel.
        // You can extend Thread or use Runnable to define your tasks.
        
        // Concurrency = managing multiple tasks at once (not necessarily running them
        // at the same time).
        // Parallelism = executing multiple tasks at the same time (literally in
        // parallel).

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        System.out.println();
        t1.start();
        t2.start();

    }
}
