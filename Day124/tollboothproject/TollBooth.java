
import java.util.Scanner;

public class TollBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TollBooth tollBooth = new TollBooth();


        String choice;

        do {

            System.out.print("Enter a command (pay, nopay, display, exit): ");
            choice = sc.next();
            System.out.println();

            switch (choice.toLowerCase()) {
                case "pay":
                    tollBooth.payingCars();
                    break;
                case "nopay":
                    tollBooth.noPayCars();
                    break;
                case "display":
                    tollBooth.display();
                    break;
                case "exit":
                    System.out.println("Exiting ");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!(choice.equals("exit")));

    }

    private  int noOfTheCars;
    private  int totalAmount;

    public TollBooth() {
        
        noOfTheCars = 0;
        totalAmount = 0;
    }

    public int getNoOfTheCars() {
        return noOfTheCars;
    }

    public void setNoOfTheCars(int noOfTheCars) {
        this.noOfTheCars = noOfTheCars;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    

    @Override
    public String toString() {
        return "TollBooth [noOfTheCars=" + noOfTheCars + ", totalAmount=" + totalAmount + "]";
    }

    private void payingCars() {
        
       setNoOfTheCars(noOfTheCars+=1); 
       setTotalAmount(totalAmount+=50); 
    }

    private void noPayCars() {

       setNoOfTheCars(noOfTheCars+=1); 
    }

    private void display() {

      System.out.println(this);
    }

   
}