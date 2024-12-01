package MultiThread.BankHandler;

public class Widthdraw extends Thread {

    private final Bank bank;
    private final int amount;

    public Widthdraw(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (!this.bank.withdrawAmmount(amount)) {
            System.out.println("Trying after few second account - " + bank.getAccountNumber());
            try {
                Thread.sleep(2000);
                this.bank.withdrawAmmount(amount);

            } catch (InterruptedException ex) {
            }
        } else {
            System.out.println("WithDrawing " + amount + " from " + bank.getAccountNumber());
        }
    }
}
