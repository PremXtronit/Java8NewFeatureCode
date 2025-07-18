package threading;


import java.util.concurrent.*;


public class CompletableFutureMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Case 1 with executor service
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(() -> {
            Thread.sleep(10000);
            return "Hello from Future";
        });

        try {
            String result = future.get();  // blocks until result is available
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        //Case 2
        CompletableFuture<String> cFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            return "Hello from CompletableFuture";
        });
        cFuture.thenApply(result -> result + " World")
                .thenAccept(System.out::println); // non-blocking

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "World");
        CompletableFuture<String> combined = f1.thenCombine(f2, (a, b) -> a + " " + b);
        combined.exceptionally(ex -> "Something went wrong: " + ex.getMessage())
                .thenAccept(System.out::println); // non-blocking
    }


}
