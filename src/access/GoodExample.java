package access;

public class GoodExample {

    private int balance;

    public GoodExample() {
        balance = 0;
    }

    // public method
    public void depositMoney(int money) {
        if (validateMoney(money)) {
            balance += money;
        } else {
            System.out.println("유요하지 않은 금액입니다.");
        }
    }

    // public method
    public void withdrawMoney(int money) {
        if (validateMoney(money) && (balance - money > 0)) {
            balance -= money;
        } else {
            System.out.println("유요하지 않은 금액입니다.");
        }
    }

    // public method
    public int getBalance() {
        return balance;
    }

    // private method : 내부에서만 사용하는 메소드는 private 으로 숨긴다.
    private boolean validateMoney(int money) {
        return money > 0;
    }
}
