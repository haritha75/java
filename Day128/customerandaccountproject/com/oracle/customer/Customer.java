package com.oracle.customer;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
    Scanner sc = new Scanner(System.in);

    private  int custID;
    private String custName;
    private String custAddress;

    public Customer() {
        custID  = getCustomerID();
        custName = isValidName();
        custAddress = isValidStr();

    }
    private int getCustomerID() {
        return (int)(Math.random()*101);
    }
    private String isValidName() {
        String name;
        boolean res;
        String name1 ="";
        sc.nextLine();
        do {
            System.out.print("Enter customer name: ");
            name = sc.nextLine();

            res = Pattern.matches("[a-zA-z][A-Za-z/s]{2,20}", name);
            if(res) {
                String str = name.toLowerCase();
                boolean flag=true;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>64&&str.charAt(i)<91)
                        name1 += str.charAt(i);
                    else if(flag==true){
                        name1 += (char)(str.charAt(i)-32);
                        flag=false;
                    }
                    else if(str.charAt(i)==' '){
                        name1 +=(" ");
                        flag=true;
                    }
                    else{
                        name1 += str.charAt(i);
                    }
                }
            }

            else {
                System.out.println("invalid name: ");//name min 3 max 20 chars
            }

        } while(!res);

        return name1;
    }
    private String isValidStr() {
        String str;
        while(true) {
            try {

                System.out.print("Enter the address: ");
                str = sc.next();
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("Enter valid address: ");
                sc.next();
                str = sc.next();
            }

        }
        return str;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}
