package MultiThread.BankHandler;

public class Bank {

    private final Account user;

    public Bank(Account user) {
        this.user = user;
    }

    public Integer getAccountNumber() {
        return user.accoutNumber;
    }

    public synchronized boolean withdrawAmmount(int amount) {
        if (this.user.getCurrentAmount() < amount) {
            return false;
        }
        this.user.setBalance(this.user.getCurrentAmount() - amount);
        return true;
    }

    public synchronized void addAmount(int amount) {
        this.user.setBalance(this.user.getCurrentAmount() + amount);
    }

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(123, 10000);
        Bank b = new Bank(account);
        AddAmount[] deposite_instance = new AddAmount[100];
        Widthdraw[] widthdraw_instance = new Widthdraw[100];
        for (int i = 0; i < deposite_instance.length; i++) {
            deposite_instance[i] = new AddAmount(b, 10);
            widthdraw_instance[i] = new Widthdraw(b, 40);
            deposite_instance[i].start();
            widthdraw_instance[i].start();
        }
        for (int i = 0; i < deposite_instance.length; i++) {
            deposite_instance[i].join();
            widthdraw_instance[i].join();
        }
        System.out.println("Total Ammount in Your account " + account.getCurrentAmount());

    }
}
