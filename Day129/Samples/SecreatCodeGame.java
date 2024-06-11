import java.util.Scanner;

public class SecreatCodeGame {

    public static void main(String[] args) {
        int secretCode = 9305; 

        Scanner scanner = new Scanner(System.in);

        int playerGuess = scanner.nextInt();


        int bulls = 0;
        int cows = 0;
        String playerGuessStr = String.valueOf(playerGuess);
        String secretCodeStr = String.valueOf(secretCode);

        for (int i = 0; i < 4; i++) {
            char playerDigit = playerGuessStr.charAt(i);
            char secretDigit = secretCodeStr.charAt(i);

            if (playerDigit == secretDigit) {
                bulls++;
            } else if (secretCodeStr.contains(String.valueOf(playerDigit))) {
                cows++;
            }
        }


        if (bulls == 0 && cows == 0) {
            System.out.println("Grade: None. The secret code is " + secretCode + ".");
        } else {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + secretCode + ".");
        }
    }
}
