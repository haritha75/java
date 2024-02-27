class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int sum1=0;
        for(var x:s.toCharArray()) {
            sum +=x;
        }
        for(var x1:t.toCharArray()) {
            sum1 +=x1;
        }
        return (char)(sum1-sum);

    }
}