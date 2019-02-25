//Coordinate 2 threads using wait() and notify().
public class Ques12 {
    public void teacher1() {
        synchronized (this){
        System.out.println("Teacher 1 has started");

        try {
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Teacher 1 has completed its execution");
    }}

    public void teacher2() {
        synchronized (this) {
            System.out.println("Teacher2 has started");
            System.out.println("Teacher2 has finished its execution");
            notify();
        }
    }

    public static void main(String[] args) {
        Ques12 q = new Ques12();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.teacher1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.teacher2();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
