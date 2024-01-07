package oop;

public class Account {

    int balance;

    void deposit(int money) {
        balance += money;
        System.out.println("your balance is "+ balance);
    }

    void withdraw(int money) {
        if (balance - money >= 0) {
            balance -= money;
            System.out.println("your balance is " + balance);
        } else {
            System.out.println("short of your balance");
            showBalance();
        }
    }

    void showBalance() {
        System.out.println("your balance is " + balance);
    }
}
