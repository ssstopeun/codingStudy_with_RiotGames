public class Account {
    private int balance=0;

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        if(this.balance < money){
            
        }
        this.balance -= money;
    }
}
