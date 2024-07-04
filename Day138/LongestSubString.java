import java.util.HashMap;

public class LongestSubstringKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int left = 0, right = 0, maxLen = 0;
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            charCountMap.put(rightChar, charCountMap.getOrDefault(rightChar, 0) + 1);
            right++;

            while (charCountMap.size() > k) {
                char leftChar = s.charAt(left);
                charCountMap.put(leftChar, charCountMap.get(leftChar) - 1);
                if (charCountMap.get(leftChar) == 0) {
                    charCountMap.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringKDistinct solution = new LongestSubstringKDistinct();
        String s = "eceba";
        int k = 2;
        System.out.println( solution.lengthOfLongestSubstringKDistinct(s, k));
    }
}