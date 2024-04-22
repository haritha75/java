import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ScoreboardGame {

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        HashMap<String, Integer> scoreMap = readScoresFromFile();
        int userScore = scoreMap.getOrDefault(name, 0);

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("!exit")) {
                System.out.println("Bye!");
                break;
            } else if (input.equals("!rating")) {
                System.out.println("Your rating: " + userScore);
            } else if (isValidInput(input)) {
                String[] options = {"rock", "paper", "scissors"};
                String computerOption = options[new Random().nextInt(options.length)];
                int pointsToAdd = calculatePoints(input, computerOption);

                if (pointsToAdd > 0) {
                    userScore += pointsToAdd;
                    System.out.println("Well done. The computer chose " + computerOption + " and failed");
                } else if (pointsToAdd == 0) {
                    System.out.println("There is a draw (" + computerOption + ")");
                } else {
                    System.out.println("Sorry, but the computer chose " + computerOption);
                }
            } else {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }

    private static HashMap<String, Integer> readScoresFromFile() {
        HashMap<String, Integer> scoreMap = new HashMap<>();

        try {
            File file = new File("rating.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(" ");
                scoreMap.put(data[0], Integer.parseInt(data[1]));
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            // If the file is not found, no problem, just return an empty scoreMap
        }

        return scoreMap;
    }

    private static int calculatePoints(String userOption, String computerOption) {
        if (userOption.equals(computerOption)) {
            return 50; // Draw
        } else if ((userOption.equals("rock") && computerOption.equals("scissors")) ||
                (userOption.equals("paper") && computerOption.equals("rock")) ||
                (userOption.equals("scissors") && computerOption.equals("paper"))) {
            return 100; // Win
        } else {
            return -100; // Lose
        }
    }

    private static boolean isValidInput(String input) {
        return input.equals("rock") || input.equals("paper") || input.equals("scissors");
    }
}
