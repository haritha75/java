import java.util.Scanner;

public class MinimumCostRectangles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int K = scanner.nextInt();

            int result = solve(N, M, K);
            System.out.println(result);
        }
    }

    private static int solve(int N, int M, int K) {
        int minCost = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                int area = i * j;
                if (area >= N * M) {
                    int cost = (int) Math.pow((area - K), 2);
                    minCost = Math.min(minCost, cost);
                }
            }
        }

        return minCost;
    }
}