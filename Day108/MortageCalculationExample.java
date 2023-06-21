import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculationExample {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        
        

        int principal = (int) readInput("Principal", 1000, 1000000000);

        float annualRate = (float) readInput("Annual Interest Rate", 1, 48);
        float monthlyRate =  getMonthlyRate(annualRate);

        byte years = (byte) readInput("Time (In Years)", 1,30);
        short noOfPayments =  getNumOfPayments(years);

        double mortage = findMortage(principal, monthlyRate, noOfPayments);
        String formatedMonthlyAmount =  NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(formatedMonthlyAmount);

    }
     public static double readInput(String prompt,int min,int max) {

        Scanner sc = new Scanner(System.in);

        double value;
        while(true) {

            System.out.println(prompt+": ");
            value = sc.nextInt();
            if(value >= min && value <= max ) {
                break;
            }
            System.out.println("Enter a value between "+min+" and "+max);

        }
        return value;

    }
    public static float getMonthlyRate(float annualRate) {

        float monthlyRate =  annualRate/PERCENT/MONTHS_IN_YEAR;
        return monthlyRate;


    }
    
    public static short getNumOfPayments(byte years) {

        return (short) (years*MONTHS_IN_YEAR);
    }
    
    public static double findMortage(int principal,float monthlyRate,short noOfPayments) {

      double mortage = principal * (monthlyRate * Math.pow((1+monthlyRate),noOfPayments)) / ((Math.pow((1+monthlyRate),noOfPayments))-1);
      return mortage;


    }
}