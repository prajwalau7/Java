import java.util.Scanner;

class Atm {

    int pin = 1234;
    int accno = 9535;
    float balance = 1000;

    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.println("Enter deposit amount");
        int deposit = sc.nextInt();
        float currentBalance = balance += deposit;
        balance = currentBalance;
        System.out.println("Transaction successfull");
        System.out.println("-----------------------------------");
        System.out.println("Current balance " + currentBalance);
    }

    void withdraw() {
        System.out.println("Enter withdraw amount");
        int withdraw = sc.nextInt();
        if (balance > withdraw) {
            float currentBalance = balance -= withdraw;
            balance = currentBalance;
            System.out.println("Transaction successfull");
            System.out.println("-----------------------------------");
            System.out.println("Current balance " + currentBalance);
        } else {
            System.out.println("insufficient balance");
        }
    }

    void balanceCheck() {
        System.out.println("Current balance " + balance);
    }

    void Transaction() {
        System.out.println("1.  Deposit");
        System.out.println("2.  Withdraw");
        System.out.println("3.  Balance enquiry");
        System.out.println("4.  exit");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                deposit();
                Transaction();
                break;
            case 2:
                withdraw();
                Transaction();
                break;
            case 3:
                balanceCheck();
                Transaction();
                break;
            case 4:
                System.out.println("Thanks for using");
                return;

            default:
                System.out.println("Invalid option");
                break;
        }
    }

    void operation() {
        System.out.println("Enter your Account number");
        int enterredacno = sc.nextInt();
        if (enterredacno == accno) {
            System.out.println("Enter your Pin");
            int enterredPin = sc.nextInt();
            if (enterredPin == pin) {
                Transaction();
            }
        } else {
            System.out.println("Invalid Account number");
        }
    }

    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.operation();
    }

}