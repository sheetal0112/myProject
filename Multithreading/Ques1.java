//Create and Run a Thread using Runnable Interface and Thread class
public class Ques1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Runnable Thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new Ques1())
            .start();
    }
}
