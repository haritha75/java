//write a program that generates a random number and asks the user to guess what the number is.if the user's guess is higher than the random number,the program should diaplay"too high,try again."if the user's guess is lower than the random number,the program should display "too low",try again.The program should use aloop that repeats untill the user correctly guesses the random number.
import java.util.Scanner;
public class GuessTheValue
{
public static void main(String args[])
{
int n=(int)(Math.random()*101);
Scanner sc=new Scanner(System.in);
int guess;
do
{
System.out.println("enter guess number");
guess=sc.nextInt();
if(guess>n)
System.out.println("too high");
else if(guess<n)
System.out.println("too low");
else
System.out.println("it's correct");
}
while(guess!=n);
}
}
