import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MortageCalculatorEx {

    public static void main(String[] args) throws Exception {

        MortageCalculator m = new MortageCalculator();
        m.MortageCal();

        
    }
    
}
class MortageCalculator {

    Scanner sc = new Scanner(System.in);

    final byte MONTHS_IN_YEAR = 12;

    final byte PERCENT = 100;
     int prinicipal =0;
     float monthlyRate =0;
     short noOfPayments =0;

     public void MortageCal() {

     boolean flag = true;

     while(flag) {

        System.out.print("Principal : ");
        try {
        prinicipal = sc.nextInt();
        
        if(prinicipal >=1000 && prinicipal <= 1000000000) 
           flag = false;
           
        }
        catch(InputMismatchException e){
            System.out.println("enter a value between 1000 and 1000000000");  
            sc.next();            

           
        }
    }
    boolean flag1 = true;

     while(flag1) {

        System.out.print("Annual interest rate : ");
        try {
        float yearlyRate = sc.nextFloat();

        if(yearlyRate >=1 && yearlyRate<= 48) {
            monthlyRate = yearlyRate/PERCENT/MONTHS_IN_YEAR;
            flag1 = false;
        }
        else {
            System.out.println("enter a value 1 and 48");
        }
        }
        catch(Exception e) {
        System.out.println("enter a value between 1 and 48");
        sc.next();
        }

     }

     boolean flag2 = true;

     while(flag2) {

        System.out.print("Time Frame (In years) : ");
        try {
        byte years = sc.nextByte();

        if(years>=1 && years<=30) {
            noOfPayments = (short) (years*MONTHS_IN_YEAR);
            flag2 = false;
        }
        else {
            System.out.println("enter a value between 1 and 30");

        }

        }
        catch(Exception e) {
        System.out.println("enter a value between 1 and 30");
        sc.next();
        }
     }

    double mortage = prinicipal * (monthlyRate * Math.pow((1+monthlyRate),noOfPayments)) / ((Math.pow((1+monthlyRate),noOfPayments))-1);
    String formatedMonthlyAmount =  NumberFormat.getCurrencyInstance().format(mortage);
    System.out.println(formatedMonthlyAmount);
}

}

     



