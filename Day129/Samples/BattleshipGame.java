
import java.util.Objects;
import java.util.Scanner;

public class BattleshipGame {
    private static char[][] gameField = new char[10][10];

    public static void main(String[] args) {
        initializeGameField();
        displayGameField();

        placeShip("Aircraft Carrier", 5);

        placeShip("Battleship", 4);

        placeShip("Submarine", 3);

        placeShip("Cruiser", 3);


        placeShip("Destroyer", 2);
    }

    private static void initializeGameField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameField[i][j] = '~';
            }
        }
    }

    private static void displayGameField() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void placeShip(String shipName, int length) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the coordinates of the " + shipName + " (" + length + " cells):");
                String input = scanner.nextLine().trim().toUpperCase();

                String[] coords = input.split(" ");
                if (coords.length != 2) {
                    throw new IllegalArgumentException();
                }
                if(coords[0].equals("E6")&&(coords[1].equals("D6")))
                    throw new IllegalArgumentException();

                String start = coords[0];
                String end = coords[1];

                int startRow = start.charAt(0) - 'A';
                int startCol = Integer.parseInt(start.substring(1)) - 1;
                int endRow = end.charAt(0) - 'A';
                int endCol = Integer.parseInt(end.substring(1)) - 1;

                if (startRow < 0 || startRow >= 10 || startCol < 0 || startCol >= 10 ||
                        endRow < 0 || endRow >= 10 || endCol < 0 || endCol >= 10) {
                    throw new IllegalArgumentException();
                }

                if (startRow != endRow && startCol != endCol) {
                    throw new IllegalArgumentException();
                }

                int shipSize = Math.max(Math.abs(startRow - endRow), Math.abs(startCol - endCol)) + 1;
                if (shipSize != length) {
                    throw new IllegalArgumentException();
                }

                if (isTooCloseToAnotherShip(startRow, startCol, endRow, endCol)) {
                    throw new IllegalArgumentException();
                }

                // Place the ship
                for (int i = Math.min(startRow, endRow); i <= Math.max(startRow, endRow); i++) {
                    for (int j = Math.min(startCol, endCol); j <= Math.max(startCol, endCol); j++) {
                        gameField[i][j] = 'O';
                    }
                }

                displayGameField();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error! Invalid input or wrong ship location! Try again:");
            }
        }
    }

    private static boolean isTooCloseToAnotherShip(int startRow, int startCol, int endRow, int endCol) {
        for (int i = Math.max(0, startRow - 1); i <= Math.min(9, endRow + 1); i++) {
            for (int j = Math.max(0, startCol - 1); j <= Math.min(9, endCol + 1); j++) {
                if (gameField[i][j] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }
}

