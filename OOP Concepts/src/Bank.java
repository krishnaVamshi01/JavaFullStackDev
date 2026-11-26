public class Bank {
//    static block
    static String bankName ;

    static {
        bankName = "yesbei";
        System.out.println("staic block executed");
    }
}

void main(String[] args) {

    System.out.println(Bank.bankName);
}
