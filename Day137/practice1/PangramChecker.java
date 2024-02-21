import java.util.HashSet;

public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }
        
        return set.size() == 26;
    }
    
    public static void main(String[] args) {
        String testString = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is the string a pangram? " + isPangram(testString));
    }
}
