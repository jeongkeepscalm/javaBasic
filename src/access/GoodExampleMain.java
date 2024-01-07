package access;

public class GoodExampleMain {
    public static void main(String[] args) {
        GoodExample account = new GoodExample();
        account.depositMoney(60000);
        account.withdrawMoney(2000);
        account.withdrawMoney(-2000);
        System.out.println("balance : "+account.getBalance());
    }
}
