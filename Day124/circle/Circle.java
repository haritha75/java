import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {

    private double radius;
    private final static double PI = 3.14;

    Circle() {
        radius = 0;

    }

    
    public void setRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");

        while(true) {
            try {

                this.radius = sc.nextDouble();
                if(radius >0)
                break;
                else {
                    System.out.print("Enter radius value above 0 :");
                }
            }
            catch(InputMismatchException e) {
                System.out.print("invalid radius :");
                sc.next();
            }

        }

        
    }
    public static double area(double radius) {

        System.out.print("Area of a circle : ");
        return  PI*radius*radius;

    }

    public static double circumference(double radius) {

        System.out.print("Circumference of a circle: ");
        return 2*PI*radius;
    }
}
