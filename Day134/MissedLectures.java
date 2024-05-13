import java.util.Scanner;

public class MissedLectures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of chapters, starting day, ending day
        int numChapters = scanner.nextInt();
        int b = scanner.nextInt();
        int e = scanner.nextInt();

        // Output: Number of chapters the student will miss
        int missedChapters = calculateMissedLectures(numChapters, b, e);
        System.out.println(missedChapters);
    }

    private static int calculateMissedLectures(int numChapters, int b, int e) {
        // Calculate the total number of days in the repeating lecture pattern
        int totalDays = numChapters * 2;

        // Calculate the total chapters covered in the specified range
        int totalCoveredChapters = (e - b + 1) % totalDays;

        // Adjust for zero-based indexing and handle negative values
        int missedChapters = (totalCoveredChapters - 1 + totalDays) % numChapters;

        return missedChapters + 1; // Adding 1 to convert from zero-based to one-based indexing
    }
}