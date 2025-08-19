package chap3T;

public class bank {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }
    void withdraw(int amount) {
        if(balance >= amount) {
            balance = balance - amount;
        }else{
            System.out.println("잔액부족");
        }
    }
}
