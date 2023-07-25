package com.account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

        private int accID;
        TypeOfAccount typeOfAccount;
        private double accountBalance;

        Scanner sc = new Scanner(System.in);

        public Account() {
            this.accID = getID();

            setTypeOfAccount();

            this.accountBalance = getInput("Account Balance");
        }

        private int getID() {
            return (int)(Math.random()*101);
        }

        private void setTypeOfAccount() {
            int x;
            while(true) {
                try {
                    System.out.println("1.Saving Account");
                    System.out.println("2.Current Account");
                     x = sc.nextInt();
                    if (x == 1) {
                        this.typeOfAccount = TypeOfAccount.SAVINGS;
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

        public Account(int accID,double balance,TypeOfAccount typeOfAccount) {
            this.accID = accID;
            this.accountBalance = balance;
            this.typeOfAccount = typeOfAccount;

        }
    public void withDraw() {
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        if(isValidWithdrawAmount(amount)) {
            System.out.println("enter a valid withdraw amount ");
            this.accountBalance -=amount;

            return;
        }
        else if(isValidBalance()) {
            System.out.println("Amount is insufficient to withdrawn ");

            return;
        }
        else if(amount<=this.accountBalance) {
            System.out.println("Balance is less than withdraw amount ");
            return;
        }

        this.accountBalance -=amount;
        System.out.println("your transaction is successful with a withdraw request of Rs:"+amount);
    }
    private boolean isValidWithdrawAmount(int amount) {
        return amount>0;
    }
    private boolean isValidBalance() {
        return this.accountBalance<=0;
    }
    public void deposit() {

        while(true) {
            System.out.print("Enter the amount: ");
            int amount = sc.nextInt();
            if(isValidDepositAmount(amount)) {
                this.accountBalance +=amount;
                System.out.println("Rs: "+amount+" has been successfully deposited");
                return;
            }
            System.out.println("Deposit a positive amount: ");
        }
    }

    private boolean isValidDepositAmount(int amount) {
        return amount>0;
    }
    public void displayBalance() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accID=" + accID +
                ", typeOfAccount=" + typeOfAccount +
                ", accountBalance=" + this.accountBalance +
                '}';
    }
}




