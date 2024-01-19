import java.util.Scanner;

public class CollectingBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        long low = 1;
        long high = n;

        while (low < high) {
            long mid = (low + high) / 2;
            long balls = n;
            long sharma = 0;
            while (balls > 0) {
                if (balls < mid) {
                    sharma += balls;
                    balls = 0;
                } else {
                    sharma += mid;
                    balls -= mid;
                }
                balls -= balls / 10;
            }
            if (sharma >= (n + 1) / 2) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low);
    }
}
