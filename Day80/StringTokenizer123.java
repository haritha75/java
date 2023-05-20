import java.util.StringTokenizer;

public class StringTokenizer123 {

    public static void main(String[] args) {

        StringTokenizer st1 = new StringTokenizer("rock the show!","h");    

        System.out.println(st1.countTokens());    

        while(st1.hasMoreElements())

           System.out.println(st1.nextElement());
        
    }
    
}
