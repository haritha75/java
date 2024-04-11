import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args)
    {
        double firstNum1 , secondNum2;
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first numbers: "); 
        firstNum1  = sc.nextDouble();

        System.out.print("Enter second numbers: ");
        secondNum2 = sc.nextDouble();
 
        System.out.print("Enter  operatoration (+,-,*,/,%,^): ");
        char operator = sc.next().charAt(0);

        double o = 0;
 
        switch (operator) {
        case '+':
            o = firstNum1 + secondNum2;
            break;
 
        case '-':
            o = firstNum1 - secondNum2;
            break;
 
        case '*':
            o = firstNum1 * secondNum2;
            break;
 
        case '/':
            o = firstNum1 / secondNum2;
            break;
        case '%':
            o = firstNum1 % secondNum2;
            break;
        case '^':
            o = Math.pow( firstNum1 , secondNum2 );
            break;            
 
        default:
            System.out.println("Your entering wrong input");
        }
 
        formatNumber(firstNum1, secondNum2, operator, o);
    }

    static String formatString(double number) {
        String value = String.valueOf(number);
        int count =0;

        for(int i=0;i<value.length();i++) {

            if(value.charAt(i)=='.') {

                for(int k=i+1;k<value.length();k++) {
                    char digit =  value.charAt(k);
                    if(digit !='0') {
                    count++;
                    break;
                }
            }
            }
        }

        if(count == 0) {
            return String.valueOf((int)number);
        }
        else {
            return String.valueOf(number);
        }
     
    }

    
    static void formatNumber(double firstNum1,double secondNum2, Character operator, double result) {

        String first = formatString(firstNum1);
        String second = formatString(secondNum2);
        String res = formatString(result);

        System.out.println(first + " " + operator + " " + second + " = " + res);


    }

    
}
