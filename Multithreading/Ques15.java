//Create a deadlock and Resolve it using tryLock()
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Ques15 {
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);
    //DEADLOCK CREATED!!!!
   /* public void w1()
    {
        lock2.lock();
        System.out.println("W1 lock2");
        lock1.lock();
        System.out.println("W1 lock1");
        lock1.unlock();
        lock2.unlock();
    }
    public void w2()
    {
        lock1.lock();
        System.out.println("W2 lock1");
        lock2.lock();
        System.out.println("W2 lock2");
        lock2.unlock();
        lock1.unlock();
    }*/
    public void acquireLock(Lock lock1, Lock lock2){

        boolean acquireLock1= lock1.tryLock();
    boolean acquireLock2= lock2.tryLock();

        if(acquireLock1 && acquireLock2){
        return;
    }

        if(acquireLock1){
        lock1.unlock();
    }

        if(acquireLock2){
        lock2.unlock();
    }

}

    public void w1(){
        acquireLock(lock1,lock2);
        System.out.println("lock 1 w 1");

        System.out.println("lock 2 w 1");
        lock2.unlock();
        lock1.unlock();
    }

    public void w2(){
        acquireLock(lock2,lock1);
        System.out.println("lock 1 w 2");
        System.out.println("lock 2 w 2");
        lock1.unlock();
        lock2.unlock();
    }


    public static void main(String[] args) throws InterruptedException{
        Ques15 q = new Ques15();
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
    }

}
