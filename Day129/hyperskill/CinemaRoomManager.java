package hyperskill;

import java.util.Scanner;

public class CinemaRoomManager {
    static Scanner sc = new Scanner(System.in);
    static int rows;
    static int howManySeatsInRows;
    static int rowNum;
    static int seatNum;
    static char[][] totalSeats;
    static int countTickets;
    static int currentIncome;
    static int totalIncome;
    public static void main(String[] args) {

        rows = isValidRows("rows");

        howManySeatsInRows = isValidRows("seats");

        totalSeats = new char[rows][howManySeatsInRows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < howManySeatsInRows; j++) {
                totalSeats[i][j] = 'S';
            }
        }

        int totalCapacity = rows * howManySeatsInRows;
        if (totalCapacity <= 60) {

            totalIncome = rows*howManySeatsInRows*10;
        } else {
            int firstHalf = ((rows) / 2);
            int secondHalf = rows - firstHalf;
            totalIncome += firstHalf * howManySeatsInRows * 10;
            totalIncome += secondHalf * howManySeatsInRows * 8;
        }
        while (true) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int option = sc.nextInt();

            switch (option){
                case 1: showSeats();
                    break;
                case 2: BuyATicket();
                    countTickets++;
                    break;
                case 3: showStatistics();
                    break;
                case 0: return;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }

    public static int isValidRows(String data) {
        int rows;
        while (true){
            try {
                if(data.equals("rows"))
                    System.out.println("Enter the number of rows:");
                else if(data.equals("seats"))
                    System.out.println("Enter the number of seats in each row:");
                rows = sc.nextInt();
                break;
            } catch (Exception e){
                sc.next();
            }
        }
        return rows;
    }
    public static void showSeats(){
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= howManySeatsInRows; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");

            for (int j = 1; j <= howManySeatsInRows; j++) {
                if(totalSeats[i-1][j-1]=='B')
                    System.out.print("B ");
                else
                    System.out.print("S ");
            }

            System.out.println();
        }

    }

    public static void BuyATicket() {

        while (true) {
            try {
                System.out.println("Enter a row number:");
                rowNum = sc.nextInt();
                System.out.println("Enter a seat number in that row:");
                seatNum = sc.nextInt();
                if (rowNum < 1 || rowNum > rows || seatNum < 1 || seatNum > howManySeatsInRows) {
                    System.out.println("Wrong input!");

                } else if (totalSeats[rowNum - 1][seatNum - 1] == 'B') {
                    System.out.println("That ticket has already been purchased!");

                } else {
                    totalSeats[rowNum - 1][seatNum - 1] = 'B';
                    int totalCapacity = rows * howManySeatsInRows;
                    if (totalCapacity <= 60) {
                        System.out.println("Ticket price: " + "$10");
                        currentIncome += 10;

                    } else {
                        int firstHalf = ((rows) / 2);
                        if (rowNum <= firstHalf) {
                            System.out.println("Ticket price: " + "$10");
                            currentIncome += 10;
                        }
                        else {
                            System.out.println("Ticket price: " + "$8");
                            currentIncome += 8;
                        }

                    }
                    return;
                }
            }catch (Exception e){
                sc.next();
            }
        }

    }
    public static void showStatistics() {
        System.out.println("Number of purchased tickets: "+countTickets);
        float percentage = (float) ((double) (countTickets * 100) /(rows * howManySeatsInRows));
        System.out.printf("Percentage: %.2f%%",percentage);
        System.out.println();
        System.out.println("Current income: $"+currentIncome);
        System.out.println("Total income: $"+totalIncome);
    }
}
/*

Description
Running a cinema theatre is no easy business. To help our friends, let's add statistics to your program. The stats will show the current income, total income, the number of available seats, and the percentage of occupancy.

In addition, our friends asked you to take care of a small inconvenience: it's not good when a user can buy a ticket that has already been purchased by another user. Let's fix this!

Objectives
Now your menu should look like this:

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
When the item Statistics is chosen, your program should print the following information:

The number of purchased tickets;
The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
Current income;
The total income that shows how much money the theatre will get if all the tickets are sold.
The rest of the menu items should work the same way as before, except the item Buy a ticket shouldn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat, print That ticket has already been purchased! and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print Wrong input! and ask to enter different seat coordinates until the user picks an available seat.

Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Enter the number of rows:
> 6
Enter the number of seats in each row:
> 6

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 0
Percentage: 0.00%
Current income: $0
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 2.78%
Current income: $10
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!

Enter a row number:
> 4
Enter a seat number in that row:
> 4

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 0

 */