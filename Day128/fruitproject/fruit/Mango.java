package fruit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mango extends Fruit{
    Scanner sc = new Scanner(System.in);
    private double weight;
    private String color;
    private double cost;

    @Override
    void cost() {

    }

    public Mango() {
        cost = isValid();
        this.weight = isValid();
        this.color = isValidStr();


    }

    public Mango(double cost,double weight,String color) {
        this.cost = cost;
        this.color = color;
        this.weight = weight;

    }
    private double isValid() {
        boolean flag = false;
        double val;
        do {
            System.out.print("Enter  val: ");
            val = sc.nextDouble();
            if(val>0 ) {
                flag = true;
            }
            if(flag);
            else
                System.out.println("Please enter a valid value:  ");
        } while(!flag);

        return val;

    }
    private String isValidStr() {
        String str;
        while(true) {
            try {

                System.out.print("Enter the color: ");
                str = sc.next();
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("Enter valid string: ");
                sc.next();
                str = sc.next();
            }

        }
        return str;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

}
