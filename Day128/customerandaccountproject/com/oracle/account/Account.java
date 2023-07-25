package com.oracle.account;

import com.oracle.customer.Customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

        private int accountNo;
        TypeOfAccount typeOfAccount;
        private int accountBalance;

        Customer customer;
        Scanner sc = new Scanner(System.in);

        public Account() {
            this.accountNo = getNum();

            setTypeOfAccount();

            this.accountBalance = getInput("Account Balance");
            customer = new Customer();
        }
        private int getNum() {
            return (int)(Math.random()*101);
        }

        private void setTypeOfAccount() {
            while(true) {
                try {
                    System.out.println("1.Saving Account");
                    System.out.println("2.Current Account");
                    int x = sc.nextInt();
                    if (x == 1) {
                        this.typeOfAccount = TypeOfAccount.SAVING;
                        break;
                    } else if (x == 2) {
                        this.typeOfAccount = TypeOfAccount.CURRENT;
                        break;
                    } else {
                        System.out.println("enter a valid choice : ");
                    }
                }
                catch(InputMismatchException e) {
                    System.out.println("Enter correct valid:");
                    sc.next();
                }

            }
        }

        private int getInput(String str) {
            System.out.print("Enter the "+str+": ");
            int x;
             while(true) {
             try {
                 x = sc.nextInt();
                 if(x>0) {
                     break;
                 }
                 else {
                     System.out.print("Enter valid balance: ");
                 }

             } catch (InputMismatchException e) {
                 System.out.println("Enter correct one: ");
                 sc.next();
             }
         }

            return x;
        }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", typeOfAccount=" + typeOfAccount +
                ", accountBalance=" + accountBalance +
                ", customer=" + customer +
                '}';
    }
}

