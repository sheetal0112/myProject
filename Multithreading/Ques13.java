//Coordinate mulitple threads using wait() and notifyAll()
public class Ques13 {
    public void t1()
    {
synchronized (this){
    System.out.println("t1 has begun");
    try {
          wait();
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
    System.out.println("t1 has ended");
}
    }
    public void t2()
    {
        synchronized (this){
            System.out.println("t2 has begun");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 has ended");
        }
    }
    public void t3()
    {
        synchronized (this){
            System.out.println("t3 has begun");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3 has ended");
        }
    }
    public void t4()
    {
        synchronized (this){
            System.out.println("t4 has begun");
            System.out.println("t4 has ended");
            notifyAll();
        }
    }

    public static void main(String[] args) {
        Ques13 q = new Ques13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q.t1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q.t2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q.t3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q.t4();
            }
        }).start();
    }


}
