

class mynewthread extends Thread {
   

    public void run() {
        int i = 1;
        while (i < 1000) {

            System.out.println("thread");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
    }
}

class mynewthread_1 extends Thread {
   

    public void run() {
        int i = 1;
        while (i < 1000) {

            System.out.println("new thread 1");
            i++;
        }
    }
}

public class program48 {
    public static void main(String[] args) {
        // thread method
        mynewthread m = new mynewthread();
        mynewthread_1 m1 = new mynewthread_1();
        System.out.println();
        m.start();
        try {
            m.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        m1.start();

        
        m.start();
        m1.start();

    }
}
