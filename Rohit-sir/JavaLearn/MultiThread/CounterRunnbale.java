package MultiThread;

public class CounterRunnbale extends Thread {

    Counter obj;

    public CounterRunnbale(Counter cntr) {
        this.obj = cntr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            obj.increment();
        }

    }
}
