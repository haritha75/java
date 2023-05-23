public class ConstructorVsInitializedBlock {

    public static void main(String[] args) {
        

        Duck d = new Duck();
        Duck d1 = new Duck();
    }
    
}
class Duck {

    Duck() {

        System.out.println("it iwll excuted every time and it will print last");
    }


    {

        System.out.println("it will print every time whenever calling class with different objects but it print firsr compared to constructor and it will be print next compated static block");
    }
}