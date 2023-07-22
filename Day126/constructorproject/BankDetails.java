
import java.util.Scanner;

public class BankDetails {

    private int accountNo;
    TypeOfAccount typeOfAccount;
    private int accountBalance;

    Scanner sc = new Scanner(System.in);

    public  BankDetails() {
        this.accountNo = getInput("Account No");

        setTypeOfAccount();

        this.accountBalance = getInput("Account Balance");
    }

    private void setTypeOfAccount() {
        while(true) {
            System.out.println("1.Saving Account");
            System.out.println("2.Current Account");
            int x =sc.nextInt();
            if(x==1) {
                this.typeOfAccount = TypeOfAccount.SAVING;
                break;
            }
            else if(x==2) {
                this.typeOfAccount = TypeOfAccount.CURRENT;
                break;
            }
            else {
                System.out.println("enter a valid choice : ");
            }

        }
    }

   private int getInput(String str) {
       System.out.print("Enter the "+str+": ");
       int x =sc.nextInt();
       return x;

    }
    public void withDraw() {
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        if(isValidWithdrawAmount(amount)) {
            System.out.println("enter a valid withdraw amount ");
            this.accountBalance -=amount;

            return;
        }
        else if(isValidBalance()) {
            System.out.println("Amount is insufficient to withdrawn ");

            return;
        }
       else if(amount<=this.accountBalance) {
            System.out.println("Balance is less than withdraw amount ");
            return;
        }

        this.accountBalance -=amount;
        System.out.println("your transaction is successful with a withdraw request of Rs:"+amount);
    }
    private boolean isValidWithdrawAmount(int amount) {
        return amount>0;
    }
    private boolean isValidBalance() {
        return this.accountBalance<=0;
    }
    public void deposit() {

        while(true) {
            System.out.println("Enter the amount: ");
            int amount = sc.nextInt();
            if(isValidDepositAmount(amount)) {
                this.accountBalance +=amount;
                System.out.println("Rs: "+amount+" has been successfully deposited");
                return;
            }
            System.out.println("Deposit a positive amount: ");
        }
    }

    private boolean isValidDepositAmount(int amount) {
        return amount>0;
    }
    public void displayAccountDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "accountNo=" + accountNo +
                ", typeOfAccount=" + typeOfAccount +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
