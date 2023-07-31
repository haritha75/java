import java.util.Scanner;
public class MakeAMove {
    static Scanner scanner = new Scanner(System.in);
    static String data = scanner.next();

    public static void main(String[] args) {

        char[][] matrix = new char[3][3];
        int charIndex = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = data.charAt(charIndex++);

            }
        }

        printMatrix(matrix);
        makeMove(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    private static void makeMove(char[][] matrix) {
        int row, col;

        while (true){

            try {
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 1 || row > 3 || col < 1 || col > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (matrix[row-1][col - 1] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    matrix[row-1][col - 1] = 'X';
                    break;
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }

        printMatrix(matrix);
    }
}
