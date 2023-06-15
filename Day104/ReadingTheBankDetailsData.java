import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ReadingTheBankDetailsData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            String custName = sc.next();

            FileInputStream fis = new FileInputStream("customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int len = ois.readInt(); //here, we know that first line containing int type  in that file.

            Bank list[] = new Bank[len];

            for(int i=0;i<len;i++) 
            list[i] = (Bank)ois.readObject(); //read values are stored in list array.

            for(Bank cust : list) {
                if(cust.name.equalsIgnoreCase(custName)) //here,  if user input name and x variable name  same then it returns 
                System.out.println(cust.balance);
            }
            ois.close();
            fis.close();


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
