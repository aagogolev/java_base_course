package lesson5;

public class BankAccountDZ {
    int id;
    String name;
    double balance;

    void refill(double summa_r) {
        balance += summa_r;
    }

    void withdrawalFromAccount(double summa_w) {
        balance -= summa_w;
    }

    void info() {
        System.out.println("Сurrent balance: " + balance);
    }
}

class BankAccountDZtest {
    public static void main(String[] args) {
        BankAccountDZ ba1 = new BankAccountDZ();
        ba1.info();
        ba1.refill(15);
        ba1.info();
        ba1.withdrawalFromAccount(5);
        ba1.info();
    }
}
