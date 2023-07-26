package fruit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Apple extends Fruit{

    Scanner sc = new Scanner(System.in);
    private double weight;
    private String color;


    @Override
    void cost() {

    }

    public Apple() {

        cost = isValid();
        this.weight = isValid();
        this.color = isValidStr();

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

    public Apple(double cost,double weight,String color) {
        this.cost = cost;
        this.color = color;
        this.weight = weight;

    }


    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
