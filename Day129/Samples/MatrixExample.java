import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        char[][] matrix = new char[3][3];
        int charIndex = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matrix[i][j] = data.charAt(charIndex++);
            }
        }

        printGrid(matrix);
        System.out.println(checkGameResult(matrix));

    }
    private static void printGrid(char[][] matrix){
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
    private static String checkGameResult(char[][] matrix) {
        int xCount = 0;
        int oCount = 0;
        boolean xWins = false;
        boolean oWins = false;

        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                if (matrix[i][0] == 'X') xWins = true;
                else if (matrix[i][0] == 'O') oWins = true;
            }

            if (matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]) {
                if (matrix[0][i] == 'X') xWins = true;
                else if (matrix[0][i] == 'O') oWins = true;
            }
        }

        if ((matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) ||
                (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])) {
            if (matrix[1][1] == 'X') xWins = true;
            else if (matrix[1][1] == 'O') oWins = true;
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') xCount++;
                else if (matrix[i][j] == 'O') oCount++;
            }
        }


        if (Math.abs(xCount - oCount) > 1 || (xWins && oWins)) {
            return "Impossible";
        } else if (xWins) {
            return "X wins";
        } else if (oWins) {
            return "O wins";
        } else if (xCount + oCount == 9) {
            return "Draw";
        } else {
            return "Game not finished";
        }
    }
}

