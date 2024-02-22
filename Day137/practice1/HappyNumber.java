import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        int s = 0;
        while(n!=0)
        {
            s+= Math.pow(n%10,2);
            n = n/10;
        }

        HashSet<Integer> set = new HashSet<>();
        while(s!=1 && !set.contains(s))
        {
            n = s;
            s = 0;
            set.add(n);
            while(n!=0)
            {
                s+=Math.pow(n%10,2);
                n = n/10;
            }
        }
        if (s==1)
        {
            return true;
        }
        return false;

    }
}