package MultiThread;

import java.util.concurrent.Semaphore;

public class QunatityLock {

    static int quantity = 3;
    static Semaphore s;

    public static void main(String[] args) throws InterruptedException {
        s = new Semaphore(1);
        Runnable r_1 = () -> {
            try {
                s.acquire();
            } catch (InterruptedException ex) {
            }
            for (int i = 0; i < 100000; i++) {
                quantity++;

            }
            s.release();
        };
        Runnable r_2 = () -> {
            try {
                s.acquire();
            } catch (InterruptedException ex) {
            }
            for (int i = 0; i < 100000; i++) {
                quantity--;

            }
            s.release();
               };
        
        Thread a = new Thread(r_1);
        Thread b = new Thread(r_2);
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(quantity);
    }
}
