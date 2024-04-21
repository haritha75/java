import java.util.Scanner;

public class SubstringQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the string
        int N = scanner.nextInt();

        // Input the string
        String S = scanner.next();

        // Input the number of queries
        int Q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < Q; i++) {
            // Input the characters for the query
            char X = scanner.next().charAt(0);
            char Y = scanner.next().charAt(0);

            // Count the substrings
            int count = countSubstrings(S, X, Y);

            // Output the result for each query
            System.out.println(count);
        }

        scanner.close();
    }

    // Function to count substrings with X and Y as endpoints
    private static int countSubstrings(String s, char X, char Y) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == X) {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == Y) {
                        count++;
                    }
                }
            } else if (s.charAt(i) == Y) {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == X) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
