import java.util.Scanner;

public class CoffeeMachine {

    static int cups;
    
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();
        checkingNumberOfCoffees(water,milk,coffeeBeans);
    }
    
    
    public static void checkingNumberOfCoffees(int water,int milk, int coffeeBeans){
        int totalWater = water/200;
        int totalMilk = milk/50;
        int totalCoffeeBeans = coffeeBeans/15;
        int actualCups = Math.min(totalWater,Math.min(totalMilk,totalCoffeeBeans));
        
        if(actualCups==cups)
            System.out.println("Yes, I can make that amount of coffee");
        else if(actualCups<cups)
            System.out.println("No, I can make only "+actualCups+" cup(s) of coffee");
        else
            System.out.println("Yes, I can make that amount of coffee (and even "+(actualCups-cups)+" more than that)");
    }

}

