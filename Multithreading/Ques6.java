import java.util.concurrent.*;

//Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.
public class Ques6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        executorService.shutdown();
        if(integerFuture.isDone())
        {
            System.out.println(integerFuture.get());
        }
        if(integerFuture.isCancelled())
        {
            System.out.println("your task has been cancelled");
        }

    }
}
