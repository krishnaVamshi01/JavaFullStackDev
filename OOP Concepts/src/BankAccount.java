public class BankAccount {
//    Encapsulation - data hiding + controlled access by using methods

    private double balance = 50000.00;

    public double balance(){
        return balance;
    }
}

void main(String[] args) {
    BankAccount account = new BankAccount();
    System.out.println(account.balance);
}

