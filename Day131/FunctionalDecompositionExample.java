//In this example, the program breaks down the mathemtical operations into seperate functions.In this way each function resposnible for a specific operation and making the code more readable,easier to mainatain.
public class FunctionalDecompositionExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        int sumResult = addNumbers(num1, num2);
        int differenceResult = subtractNumbers(num1, num2);
        int productResult = multiplyNumbers(num1, num2);


        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
    }


    public static int addNumbers(int a, int b) {
        return a + b;
    }


    public static int subtractNumbers(int a, int b) {
        return a - b;
    }


    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
