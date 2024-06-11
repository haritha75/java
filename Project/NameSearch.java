import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameSearch {
    public static void main(String[] args) {
        // Sample names in the record
        List<String> nameRecord = new ArrayList<>();
        nameRecord.add("John Doe");
        nameRecord.add("Alice Smith");
        nameRecord.add("Bob Johnson");
        nameRecord.add("Steve Brown");
        nameRecord.add("Eve Taylor");

        // Prompt for search input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some characters to search: ");
        String searchInput = scanner.nextLine();

        String regex = ".*" + Pattern.quote(searchInput) + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        List<String> matchingNames = new ArrayList<>();
        for (String name : nameRecord) {
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()) {
                matchingNames.add(name);
            }
        }

        if (matchingNames.isEmpty()) {
            System.out.println("No matching names found.");
        } else {
            System.out.println("Matching names:");
            for (String name : matchingNames) {
                System.out.println(name);
            }
        }
    }
}