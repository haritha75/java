import java.util.Scanner;

public class CountZeroes {

    public static void main(String[] args) {

        System.out.println(countZeroes(70502));
    }

    private static int countZeroes(int n) {

        if(n==0)
            return 0;

        if(n%10==0) {

            return 1+countZeroes(n/10);

        } else {

            return countZeroes(n/10);
        }
    }
}