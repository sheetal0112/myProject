import java.util.concurrent.atomic.AtomicInteger;

//Use Atomic Classes instead of Synchronize method and blocks.
public class Ques11 {

    AtomicInteger c = new AtomicInteger();

    public void worker1() {
        for (int i = 1; i <= 95; i++) {
            c.incrementAndGet();
        }
    }


    public void worker2() {
        for (int i = 1; i <= 105; i++) {
            c.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques11 s = new Ques11();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("The total count "+ s.c);
    }
}