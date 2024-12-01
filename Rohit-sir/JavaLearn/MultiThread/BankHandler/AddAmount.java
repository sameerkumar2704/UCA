package MultiThread.BankHandler;

public class AddAmount extends Thread {

    Bank bank;
    int depositeAmount;

    public AddAmount(Bank bank, int amount) {
        this.bank = bank;
        this.depositeAmount = amount;
    }

    @Override
    public void run() {
        this.bank.addAmount(depositeAmount);
        System.out.println("Deposting " + depositeAmount + " in " + bank.getAccountNumber());
    }

}
