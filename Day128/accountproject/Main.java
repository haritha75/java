import com.account.Account;
import com.account.TypeOfAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(234,567, TypeOfAccount.SAVINGS);
        System.out.println(account);


    }
}