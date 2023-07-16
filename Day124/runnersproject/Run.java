//package run;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Run {
    static Scanner sc = new Scanner(System.in);
    private String nameOfTheRunner;
    private double distance;
    List<Run> list = new ArrayList<>();



    public String getNameOfTheRunner() {

        return nameOfTheRunner;
    }

    public void setNameOfTheRunner(String nameOfTheRunner) {
        this.nameOfTheRunner = nameOfTheRunner;
    }

    public double getDistance() {

        return distance;
    }

    public void setDistance(double distance) {

        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Run{" +
                ", nameOfTheRunner='" + nameOfTheRunner + '\'' +
                ", distance=" + distance +
                '}';
    }

    public void get() {
        int i=1;
        while(i<6) {
            Run r = new Run();
            System.out.print("Enter the  first name of the runner : ");
            String firstName = isValidName();
            System.out.print("Enter the last name of the runner : ");
            String lastName = isValidName();
            System.out.print("Enter the runner distance : ");
            double distance = isValidDistance();

            String fullName = getFullName(firstName, lastName);
            r.setNameOfTheRunner(fullName);
            r.setDistance(distance);
            list.add(r);
            i++;

        }
    }

    private String getFullName(String firstName, String lastName) {

        return firstName + " " + lastName;

    }

//
private static String isValidName() {
    String name;
    boolean res;
    String name1 = "";
    //sc.nextLine();
    do {
        //System.out.print("Enter runner name: ");
        name = sc.next();

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
            System.out.print("invalid name: ");
        }

    } while (!res);

    return name1;
}


private double isValidDistance() {
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
  public void show() {
      System.out.println(list);

  }
  public void Appropriate() {

        double max =0;
        for(var x : list) {
            
            if(x.getDistance()>max) {
                max = x.getDistance();
                System.out.println("highest distance runner name is : "+x.nameOfTheRunner+" And the distance is "+max);
            }
        }
  }
}
