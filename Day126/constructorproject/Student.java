
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
    static Scanner sc = new Scanner(System.in);

    private int rollNum;
    private String stuName;
    private int marks1,marks2,marks3;
    private int totalMarks;

    public Student() {

        stuName = isValidName();

        rollNum = getInput(0);
        marks1 = getInput(1);
        marks2 = getInput(2);
        marks3 = getInput(3);

        calculateTotal();
    }

    private int getInput(int i) {

                if (i == 0) {
                    System.out.print("Enter the RollNo : ");
                    int roll =  isValid();
                    return roll;

                } else {
                    System.out.print("Enter the marks of sub" + i + ": ");
                    int marks = isValid();
                    return marks;
                }
    }

    private static String isValidName() {
        String name;
        boolean res;
        String name1 = "";
        do {
            System.out.print("Enter student name: ");
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
                System.out.println("invalid name: ");
            }

        } while (!res);

        return name1;
    }

    private  int isValid() {
        int val = 0;
        boolean flag1 = true;

        while (flag1) {

            try {

                val = sc.nextInt();
                if (val >= 0 && val <= 100) {
                    break;
                }
                System.out.println("Enter valid value between 0 to 100");
            }

            catch (InputMismatchException e) {
                System.out.println("Please enter a valid value between 0 to 100");
                sc.next();

            }

        }
        return val;

    }

    public void calculateTotal() {
        this.totalMarks = marks1+marks2+marks3;
        System.out.println("Total marks : "+totalMarks);
    }
    public void display() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Student{" +
                " rollNum=" + rollNum +
                ", stuName='" + stuName + '\'' +
                ", marks1=" + marks1 +
                ", marks2=" + marks2 +
                ", marks3=" + marks3 +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
