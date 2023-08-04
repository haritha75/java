import java.util.Scanner;

public class BattleGame {
    private static char[][] gameField = new char[10][10];
    private static char[][] fogOfWarField = new char[10][10];
    private static int remainingShips = 5;

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

    public static void main(String[] args) {
        initializeGameField();
        initializeFogOfWarField();
        displayFogOfWarField();

        placeShip("Aircraft Carrier", 5);
        displayGameField();

        placeShip("Battleship", 4);
        displayGameField();

        placeShip("Submarine", 3);
        displayGameField();

        placeShip("Cruiser", 3);
        displayGameField();

        placeShip("Destroyer", 2);
        displayGameField();

        System.out.println("The game starts!\n");
        displayFogOfWarField();

        takeShot();


    }

    private static void initializeGameField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameField[i][j] = '~';
            }
        }
    }

    private static void initializeFogOfWarField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fogOfWarField[i][j] = '~';
            }
        }
    }

    private static void displayFogOfWarField() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(fogOfWarField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void displayGameFieldWithShips() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void placeAllShips() {
        placeShip("Aircraft Carrier", 5);
        placeShip("Battleship", 4);
        placeShip("Submarine", 3);
        placeShip("Cruiser", 3);
        placeShip("Destroyer", 2);
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
                if (coords[0].equals("E6") && coords[1].equals("D6"))
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

                // Place the ship on both gameField and fogOfWarField
                for (int i = Math.min(startRow, endRow); i <= Math.max(startRow, endRow); i++) {
                    for (int j = Math.min(startCol, endCol); j <= Math.max(startCol, endCol); j++) {
                        gameField[i][j] = 'O';
                        //fogOfWarField[i][j] = '~'; // Hide the ship from the player
                    }
                }

                //displayFogOfWarField();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error! Invalid input or wrong ship location! Try again:");
            }
        }
    }

    private static void takeShot() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nTake a shot!");
                String input = scanner.nextLine().trim().toUpperCase();

                int row = input.charAt(0) - 'A';
                int col = Integer.parseInt(input.substring(1)) - 1;

                if (row < 0 || row >= 10 || col < 0 || col >= 10) {
                    throw new IllegalArgumentException();
                }

                if (gameField[row][col] == 'O') {
                    gameField[row][col] = 'X';
                    fogOfWarField[row][col] = 'X'; // Update fogOfWarField to reveal the hit ship
                    displayFogOfWarField();
                    System.out.println("You hit a ship!");
                    remainingShips--;
                } else if (gameField[row][col] == '~') {
                    gameField[row][col] = 'M';
                    fogOfWarField[row][col] = 'M'; // Update fogOfWarField to reveal the missed shot
                    displayFogOfWarField();
                    System.out.println("You missed!");
                } else {
                    displayFogOfWarField();
                    System.out.println("You already fired at this location!");
                }

                displayGameFieldWithShips();// Display the game field with the ships after each shot
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error! You entered the wrong coordinates! Try again:");
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

