
class practice extends Thread {
    public void run() {
        int i = 1;
        while (i < 1000) {

            System.out.println("hello");
            i++;
        }
    }
}

class practice_1 extends Thread {
    public void run() {
        // delay 200 minisecond
        int i = 1;
        while (i < 1000) {

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("pranshu tiwari");
            i++;
        }
    }
}

public class program49 {
    public static void main(String[] args) {
        practice p = new practice();
        practice_1 p1 = new practice_1();
        System.out.println();
        p.setPriority(2);
        p1.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(p1.getPriority());

        System.out.println(p1.getState());
        System.out.println(Thread.currentThread().getState());

        p.start();
        p1.start();
    }
}
