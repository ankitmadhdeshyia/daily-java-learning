import java.util.Scanner;

class Account {
    Scanner sc = new Scanner(System.in);
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    Account(String name, int balance, int accNum) {
        this.accountHolderName = name;
        this.balance = balance;
        this.accountNumber = accNum;
    }

    public void deposit() {
        System.out.println("Enter Amount To deposit");
        int amount = sc.nextInt();
        if (amount < 0) {
            System.out.println("Amount can not be Zero");
            return;
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw() {
        System.out.println("Enter Amount to withdraw");
        int m = sc.nextInt();
        if (m > balance) {
            System.out.println("Withdrawing Money");
            balance = balance - m;
        } else {
            System.out.println("Insuffcient Fund");
        }

    }

    public void checkBalance() {
        System.out.println(balance);
    }
    public void showAccountDetails(){
        System.out.println("Account Holder Name"+accountHolderName);
        System.out.println("Account Number"+accountNumber);
    }

}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            Account ac = new Account("Ankit", 1000, 12340);
            System.out.println("Select operation \n1:Deposit\n 2:Withdraw\n3:Check Balance\n 4:Exit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    ac.deposit();
                    break;
                case 2:
                    ac.withdraw();
                    break;
                case 3:
                    ac.checkBalance();
                    break;
                case 4:
                    ac.checkBalance();

                    flag=false;
                    break;
                default:
                    break;
            }
        }

    }
}