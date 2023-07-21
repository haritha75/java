package student;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {

    static Scanner sc = new Scanner(System.in);

    private static int uniqueNo;
    private int rollNo;

    private String studentName;
    private int marks[] = new int[5];

   public Student() {

       uniqueNo++;
       rollNo = uniqueNo;
    }

    public int getRollNo() {
        return rollNo;

    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getA() {
        return marks;
    }

    public void setA(int[] marks) {
        this.marks = marks;
    }
    


    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", marks=" + Arrays.toString(marks) + "]";
    }

    public void input() {
        System.out.print("Enter student name : ");
        this.studentName = isValidName();
        System.out.println("Enter  student marks: ");
       for(int i=0;i<marks.length;i++) {
           this.marks[i]=(int) isValidMarks();
       }
    }

    private static String isValidName() {
        String name;
        boolean res;
        String name1 = "";

        do {
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


    private static double isValidMarks() {
        int marks = 0;
        boolean flag1 = true;

        while (flag1) {

            try {
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    break;
                }
                System.out.println("Enter valid marks between 0 to 100");
            }

            catch (InputMismatchException e) {
                System.out.println("Please enter a valid marks between 0 to 100");
                sc.next();

            }

        }
        return marks;

    }

    public void show() {

        System.out.println(this);

    }

    public static int totalStudent() {

        return uniqueNo;
    }

    private   int totalMarks() {
        int total =0;

        for(int i=0;i<marks.length;i++) {
            total += marks[i];
        }

      return total;
    
    }

    private int getHigestMarks() {

        int max =0;
        for(int i=0;i<marks.length;i++) {
            if(marks[i]>max)
            max = marks[i];
        }

        return max;
    }

    private int getLowestMarks() {

        int min =marks[0];
        for(int i=0;i<marks.length;i++) {
            if(marks[i]<min)
            min = marks[i];
        }

        return min;

    }

    private int getAverage() {

        int avg = totalMarks()/5;
        return avg;
        
    }

    private int getCountPassed() {

        int count =0;
        for(int i=0;i<marks.length;i++) {
           if(marks[i]>=50) {

              count++;
           }
        }

    return count;
    }

    public void studentDetails() {

        System.out.println("Total marks of student: "+totalMarks());
        System.out.println("Higest marks of  student: "+getHigestMarks());
        System.out.println("Lowest marks of  student: "+getLowestMarks());
        System.out.println("Average marks of student: "+getAverage());
        System.out.println("Number of passed Subjects out of five: "+getCountPassed());
        int registredStdent = Student.totalStudent();
        System.out.println("number of registred students are: "+registredStdent);
        System.out.println();

    }
}
