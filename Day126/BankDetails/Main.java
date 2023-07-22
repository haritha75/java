import bankaccount.BankDetails;

public class Main {
    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.setAccountDetails();
        bankDetails.deposit();
        bankDetails.withDraw();
        bankDetails.displayAccountDetails();

    }
}