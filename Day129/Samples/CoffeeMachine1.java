import java.util.Scanner;

public class CoffeeMachine1 {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public CoffeeMachine1() {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        disposableCups = 9;
        money = 550;
    }

    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void buyCoffee(int type) {
        int waterNeeded, milkNeeded, coffeeBeansNeeded, cost;
        switch (type) {
            case 1: // Espresso
                waterNeeded = 250;
                milkNeeded = 0;
                coffeeBeansNeeded = 16;
                cost = 4;
                break;
            case 2: // Latte
                waterNeeded = 350;
                milkNeeded = 75;
                coffeeBeansNeeded = 20;
                cost = 7;
                break;
            case 3: // Cappuccino
                waterNeeded = 200;
                milkNeeded = 100;
                coffeeBeansNeeded = 12;
                cost = 6;
                break;
            default:
                return;
        }

        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded && disposableCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            disposableCups--;
            money += cost;
        } 
        
        else {
            System.out.println("Sorry, not enough resources to make this coffee.");
        }
    }

    public void fillSupplies(int addedWater, int addedMilk, int addedCoffeeBeans, int addedDisposableCups) {
        water += addedWater;
        milk += addedMilk;
        coffeeBeans += addedCoffeeBeans;
        disposableCups += addedDisposableCups;
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void main(String[] args) {
        CoffeeMachine1 machine = new CoffeeMachine1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            machine.printState();
            System.out.println("Write action (buy, fill, take):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    int type = scanner.nextInt();
                    machine.buyCoffee(type);
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int addedWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int addedMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int addedCoffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int addedDisposableCups = scanner.nextInt();
                    machine.fillSupplies(addedWater, addedMilk, addedCoffeeBeans, addedDisposableCups);
                    break;
                case "take":
                    machine.takeMoney();
                    break;
                default:
                    return;
            }
            System.out.println();
        }
    }
}
