//Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.

public class Ques10 {

    int c;

  synchronized  public void incrementCount() {
        c++;
    }

    public void worker1() {
        for (int i=1;i<=100;i++){
            incrementCount();
        }
    }

    public void worker2() {
        for (int i=1;i<=100;i++){
            incrementCount();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Ques10 s = new Ques10();
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
        System.out.println(s.c);
    }

}
