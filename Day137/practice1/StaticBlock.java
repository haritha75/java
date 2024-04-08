import java.util.*;

public class Result {


    public static int gameOfBones(int n) {
        List<Integer> primes = generatePrimes(n);
        int count = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (n >= primes.get(i)) {
                n -= primes.get(i);
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(gameOfBones(n));
    }
}
