package rectangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth) {

        this.length = isValidValue(length);
        this.breadth = isValidValue(breadth);
    }

    private double isValidValue(double val) {
        while(true) {

            try {
                if(val > 0)
                    break;
                else {
                    System.out.print("Enter valid value: ");
                    val = sc.nextDouble();
                }
            }
            catch(InputMismatchException e) {
                System.out.print("Enter valid value : ");
                sc.next();
                val = sc.nextDouble();
            }
        }
        return val;
    }
    public void area() {
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
