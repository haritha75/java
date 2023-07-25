import com.account.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. DisplayBalance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            try {
                int choice = sc.nextInt();
                switch (choice) {

                    case 1:
                        account.deposit();
                        break;
                    case 2:
                        account.withDraw();
                        break;
                    case 3:
                        account.displayBalance();
                        break;
                    case 4:
                        return;
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Enter valid choice: ");
                sc.next();
            }

        }
    }
}
