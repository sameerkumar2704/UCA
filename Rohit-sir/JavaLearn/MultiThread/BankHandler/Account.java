package MultiThread.BankHandler;

public class Account {

    int accoutNumber;
    private int currentBalance;

    public Account(int accN, int initalAmmount) {
        this.accoutNumber = accN;
        this.currentBalance = initalAmmount;
    }

    public int getCurrentAmount() {
        return this.currentBalance;
    }

    public void setBalance(int amount) {
        this.currentBalance = amount;
    }

}
