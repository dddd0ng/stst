package chap3T;

public class bankSolution {
    public static void main(String[] args) {
        bank bk = new bank();
        bk.deposit(10000);
        bk.withdraw(9000);
        bk.withdraw(3000);
        System.out.println("잔고 : "+bk.balance);
    }
}
