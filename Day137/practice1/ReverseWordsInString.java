//class Solution {
//    public String reverseWords(String s) {
//
//        s = s.trim().replaceAll(" \\s+", " ");
//        String[] words = s.split(" ");
//        StringBuilder reversedString = new StringBuilder();
//        for(int i=words.length -1;i>=0;i--){
//            reversedString.append(words[i]).append(" ");
//        }
//        return reversedString.toString().trim();
//    }
//}