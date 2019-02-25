//Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.
public class Ques16 {
    int c;

    public void count() {
        synchronized (this) {
            c++;
        }
    }

    public void w1() {
        for (int i = 1; i <= 100; i++) {
            count();
        }
    }

    public void w2() {
        for (int i = 1; i <= 100; i++) {
            count();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Ques16 q = new Ques16();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.w1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.w2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(q.c);
    }
}
