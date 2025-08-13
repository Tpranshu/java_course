
class mythread1 extends Thread {
    public mythread1(String name) {
        super(name);
        // System.out.println(name);
    }

    public void run() {
        int i = 1;
        while (i < 1000) {

            System.out.println("thread " + this.getName());
            i++;
        }
    }
}

public class program47 {
    public static void main(String[] args) {
        System.out.println();
        mythread1 m = new mythread1("pranshu");
        mythread1 m1 = new mythread1("pranshu 1");
        mythread1 m2 = new mythread1("pranshu 2");
        mythread1 m3 = new mythread1("pranshu 3");
        mythread1 m4 = new mythread1("pranshu 4 (most important thread)");

        m4.setPriority(Thread.MAX_PRIORITY);
        m1.setPriority(Thread.MIN_PRIORITY);

        m.start();
        m1.start();
        m2.start();
        m3.start();
        m4.start();

        /*

         * thread in Java gets a priority between 1 and 10 --
         * 1 is the lowest priority (least important)
         * 10 is the highest priority (most important)
         * 5 is the normal/default priority
         * 
         */
    }
}
