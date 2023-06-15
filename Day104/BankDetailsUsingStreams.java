import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BankDetailsUsingStreams {
    public static void main(String[] args) {
        

        try {

            Bank customer[] = {new Bank("haritha",21,2000), //here creating customer array that containing the data.
                               new Bank("reddy",22,3000),
                               new Bank("ramya",22,3500)};
                               System.out.println(customer.length);

                FileOutputStream fos = new FileOutputStream("customer.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeInt(customer.length); //we are writting first int type data that is length of customer array.

                for(int i=0;i<customer.length;i++)
                   oos.writeObject(customer[i]); //here,writing the data based on how much length.
                   oos.close();
                   fos.close();


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
class Bank implements Serializable {

    double balance;
    String name;
    int age;

    Bank() {

    }
    Bank(String name,int age,double balance) {
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

}