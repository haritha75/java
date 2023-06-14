import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Rock.txt");

        PrintStream ps = new PrintStream(fos);


        HDFC haritha = new HDFC("haritha");
        haritha.setBalance(15000.54);
        haritha.setMinimumBal(500);
        
        ps.println(haritha.getName());
        ps.println(haritha.getBalance());
        ps.println(haritha.getMinimumBal());
        
        fos.close();
        ps.close();



    }
}
class HDFC {

    String name;
    HDFC() {

    }
    HDFC(String name) {
        this.name =name;
    }
    double balance;
    int minimumBal;

    String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMinimumBal() {
        return minimumBal;
    }

    public void setMinimumBal(int minimumBal) {
        this.minimumBal = minimumBal;
    }
}