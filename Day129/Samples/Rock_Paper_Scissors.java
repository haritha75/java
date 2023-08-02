import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors
 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);


        String[] options = { "rock", "paper", "scissors" };


        Random random = new Random();
        String computerChoice = options[random.nextInt(options.length)];



        String userChoice = scanner.nextLine().toLowerCase();


        boolean isValidOption = false;
        for (String option : options) {
            if (option.equals(userChoice)) {
                isValidOption = true;
                break;
            }
        }

        if (isValidOption) {


            if (userChoice.equals(computerChoice)) {
                System.out.println("There is a draw (" + userChoice + ")");
            } 
            else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock"))
            ) 
            {
                System.out.println("Well done. The computer chose " + computerChoice + " and failed");
            } 
            
            else {
                System.out.println("Sorry, but the computer chose " + computerChoice);
            }
        } 
        
        
        
        else {
            System.out.println("Invalid input. Please choose from rock, paper, or scissors.");
        }

    }
}

