package Employee;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {

    Scanner sc = new Scanner(System.in);

    String employeeNo;
    float Compensation;

    public String getEmployeeNo() {

        return employeeNo;
    }

    public boolean isvalidEmpNo(String employeeNo) { //helper method

        String reg = "[A-Za-z]{2}-[0-9]{4}";

        if(Pattern.compile(reg).matcher(employeeNo).matches()) 
             return true;
           return false;
    }

    public void setEmployeeNo(String employeeNo) {

        if(isvalidEmpNo(employeeNo))

            this.employeeNo = employeeNo;
        else

            throw new InputMismatchException("Enter a valid Employee Number ");

    }

    public float getCompensation() {

        return Compensation;
    }
    
    public void setCompensation(float compensation) {

        Compensation = compensation;
    }

    public void display() {

        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Employee [employeeNo=" + employeeNo + ", Compensation=" + Compensation + "]";
    }
   
    
}
