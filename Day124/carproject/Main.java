import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import car.*;

public class Main {
   static Scanner sc = new Scanner(System.in);
   static  List<Car> list = new ArrayList<>();

    public static void main(String[] args) {

        String choice;

        do {

            System.out.print("Enter a command (add, show, exit): ");
            choice = sc.next();
            System.out.println();

            switch (choice.toLowerCase()) {
                case "add":
                    addCarDetails();
                    break;
                case "show":
                    show();
                    break;
                case "exit":
                    System.out.println("Exiting ");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!(choice.equals("exit")));

    }

  public static void addCarDetails()
  {
      Car c = new Car();

      String carName = isValidCarName();
      c.setNameOfTheCar(carName);

      System.out.print("Enter car distance : ");
      double distance = isValidDistance();
      c.move(distance);

      while(true) {
          System.out.println("1.Enter the Direction of the car : EAST");
          System.out.println("2.Enter the Direction of the car : WEST");
          System.out.println("3.Enter the Direction of the car : SOUTH");
          System.out.println("4.Enter the Direction of the car : NORTH");
      try {
          int x = sc.nextInt();

          if (x == 1) {
              DirectionOfCar directionOfCar = DirectionOfCar.EAST;
              c.Turn(directionOfCar);
              break;
          } else if (x == 2) {
              DirectionOfCar directionOfCar = DirectionOfCar.WEST;
              c.Turn(directionOfCar);
              break;
          } else if (x == 3) {
              DirectionOfCar directionOfCar = DirectionOfCar.SOUTH;
              c.Turn(directionOfCar);
              break;

          } else if (x == 4) {
              DirectionOfCar directionOfCar = DirectionOfCar.NORTH;
              c.Turn(directionOfCar);
              break;

          } else {
              System.out.println("Enter a valid Direction between 1 to 4 : ");

          }
      }
      catch(InputMismatchException e) {
          System.out.println("Enter valid choice : ");
          sc.next();
      }

      }


      list.add(c);

    }
    private static String isValidCarName() {
        String name;
        boolean res;
        String name1 = "";
        sc.nextLine();
        do {
            System.out.print("Enter car name: ");
            name = sc.nextLine();

            res = Pattern.matches("[a-zA-z][A-Za-z\\s]{2,20}", name);
            if (res) {
                String str = name.toLowerCase();
                boolean flag = true;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 64 && str.charAt(i) < 91)
                        name1 += str.charAt(i);
                    else if (flag == true) {
                        name1 += (char) (str.charAt(i) - 32);
                        flag = false;
                    } else if (str.charAt(i) == ' ') {
                        name1 += (" ");
                        flag = true;
                    } else {
                        name1 += str.charAt(i);
                    }
                }
            }

            else {
                System.out.println("invalid car name: ");
            }

        } while (!res);

        return name1;
    }

    private static double isValidDistance() {
        double distance;
        while(true) {
            try {
                distance = sc.nextDouble();
                ;
                if (distance > 0)
                    break;
                else
                    System.out.print("enter correct distance : ");
            }
            catch(InputMismatchException e) {
                System.out.print("enter correct distance : ");
                sc.next();
            }
        }
        return distance;
    }


    public static void show() {
        for(var data : list)
            System.out.println(data);
    }
}