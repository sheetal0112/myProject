//Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Ques14 {
    Lock lock = new ReentrantLock(true);
    int c;
    void count()
    {
       lock.lock();
        c++;
        lock.unlock();
    }
    public void c1()
    {
        for(int i=1;i<=100;i++)
        {
            count();
        }
    }
    public void c2(){
        for(int i=1;i<=100;i++){
            count();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques14 q =new Ques14();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.c1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.c2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(q.c);
    }
}
