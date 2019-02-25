public class ThreadDemo extends Thread{

    @Override
    public void run(){
        System.out.println("Running Thread Demo");
    }

    public static void main(String[] args) {
        new ThreadDemo().start();
    }

}

