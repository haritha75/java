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
            o = Math.pow(firstNum1,secondNum2);
            break;            
 
        default:
            System.out.println("Your entering wrong input");
        }
 
        System.out.println(firstNum1 + " " + operator + " " + secondNum2  + " = " + o);
    }
}