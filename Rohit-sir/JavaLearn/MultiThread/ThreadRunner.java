package MultiThread;

public class ThreadRunner {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterRunnbale[] thread_arr = new CounterRunnbale[10];
        for (int i = 0; i < 10; i++) {
            thread_arr[i] = new CounterRunnbale(counter);
            thread_arr[i].start();
        }
        for (int i = 0; i < 10; i++) {

            thread_arr[i].join();
        }
        System.out.println(counter.count);

    }
}
