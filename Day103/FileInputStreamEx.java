import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx {

    public static void main(String[] args) {

        try {
        FileInputStream fis = new FileInputStream("Rock.txt"); //text file contains only string if numbers also have in text file it will consider as a characters or strings.
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                      HDFC h = new HDFC(br.readLine());
                      h.setBalance(Double.parseDouble(br.readLine()));
                      h.setMinimumBal(Integer.parseInt(br.readLine()));

                      System.out.println(h.getName());
                      System.out.println(h.getBalance());
                      System.out.println(h.getMinimumBal());
                      fis.close();
                      br.close();



        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
