class Solution {
    public boolean isAnagram(String s, String t) {
        int[] wordmap = new int[26];
        for(char c : s.toCharArray())
            wordmap[c-'a']++;
        for(char c : t.toCharArray())
            wordmap[c-'a']--;
        for(int i=0; i<26; i++)
            if(wordmap[i] != 0)
                return false;
        return true;

    }
}