import java.text.NumberFormat;

public class PercentageNumberFormat {

    public static void main(String[] args) {
        

        String res = NumberFormat.getPercentInstance().format(2);
        System.out.println(res);

        String res1 = NumberFormat.getPercentInstance().format(0.1); //1/10
        System.out.println(res1);
    }
    
}
