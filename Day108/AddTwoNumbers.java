
public class AddTwoNumbers {
    public static void main(String[] args) {

        int firstNum = 5;
        int secondNum = 7;

        int firstResult = addTwoNumbers(firstNum,secondNum);
        System.out.println(firstResult);

        int secondResult = addTwoNumbers(firstResult,firstNum);
        System.out.println(secondResult);

    }
    public static int addTwoNumbers(int firstNum, int secondNum) {
        
        return firstNum+secondNum;

    }
}