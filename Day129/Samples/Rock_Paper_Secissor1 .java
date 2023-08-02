import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Secissor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] options = { "rock", "paper", "scissors" };


        Random random = new Random();

        while (true) {

            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("!exit")) {
            
                System.out.println("Bye!");
                break;
            } 
            else if (isValidOption(userInput, options)) {
            
                String computerChoice = options[random.nextInt(options.length)];

                if (userInput.equals(computerChoice)) {
                
                    System.out.println("There is a draw (" + userInput + ")");
                } 
                else if (
                        (userInput.equals("rock") && computerChoice.equals("scissors")) ||
                                (userInput.equals("scissors") && computerChoice.equals("paper")) ||
                                (userInput.equals("paper") && computerChoice.equals("rock"))
                )
                
                 {
                    System.out.println("Well done. The computer chose " + computerChoice + " and failed");
                } 
                
                else {
                    System.out.println("Sorry, but the computer chose " + computerChoice);
                }
            } 
            
            else {
                System.out.println("Invalid input");
            }
        }


    }

    private static boolean isValidOption(String userInput, String[] options) {
    
        for (String option : options) {
            if (option.equals(userInput)) {
                return true;
            }
        }
        return false;

    }
}

