package org.example;

import java.sql.*;
import java.util.Scanner;

//Transaction management
public class BankApp_TransactionManagement {

    public static void main(String[] args) {

        String  url = "jdbc:mysql://localhost:3306/bank";
        String userName = "root";
        String password = "9754";

        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,userName,password);

            Scanner sc = new Scanner(System.in);
//            Login Module

            System.out.println("<-- Welcome to the Bank -->");
            System.out.println("Enter the bank number:");
            int acc_num =  sc.nextInt();
            System.out.println("Enter the pin:");
            int pin = sc.nextInt();

            PreparedStatement ptst = con.prepareStatement("select * from account where acc_num = ? and pin = ?");

            ptst.setInt(1,acc_num);
            ptst.setInt(2,pin);

            ResultSet res = ptst.executeQuery();
            res.next();
            String name = res.getString(2);
            int bal = res.getInt(4);
            System.out.println("welcome " + name);
            System.out.println("Balance " + bal);

//            Transfer Module

            System.out.println("<-- Transfer Details -->");
            System.out.println("Enter the beneficiary account number");
            int bacc_num = sc.nextInt();
            System.out.println("Enter the transfer amount");
            int t_amt = sc.nextInt();

            con.setAutoCommit(false);
            Savepoint s = con.setSavepoint();
//            here we are saving point so in this point to all changes having saved whenever rollback happend then this changes are all detected and previous will be replaced that is logic of the rollback8

            PreparedStatement ptmt1 = con.prepareStatement("update account set balance = balance - ? where acc_num = ?");
            ptmt1.setInt(1,t_amt);
            ptmt1.setInt(2,acc_num);
            ptmt1.executeUpdate();

            System.out.println("<-- Incoming credit request -->");
            System.out.println(name  + "account no "+acc_num+" wants to transfer "+t_amt);
            System.out.println("Press Y to receive");
            System.out.println("Press N to reject");
            String choice  = sc.next();

            if(choice.equals("Y")) {
                PreparedStatement ptmt2  = con.prepareStatement("update account set balance = balance + ? where acc_num = ?");
                ptmt2.setInt(1,t_amt);
                ptmt2.setInt(2,bacc_num);
                ptmt2.executeUpdate();

                PreparedStatement ptmt3 = con.prepareStatement("select * from account where acc_num = ?");
                ptmt3.setInt(1,bacc_num);
                ResultSet res1 = ptmt3.executeQuery();
                res1.next();
                System.out.println("Update balance is: "+res1.getInt(4));
            }
            else{

                con.rollback();

                PreparedStatement ptmt4 = con.prepareStatement("select * from account where acc_num = ?");
                ptmt4.setInt(1,bacc_num);
                ResultSet res2 = ptmt4.executeQuery();
                res2.next();
                System.out.println("Existing balance is: " +res2.getInt(4));
            }
            con.commit();

        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
