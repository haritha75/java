class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        int start=1;
        int count=0;
        for(int i=0;i<32;i++) {
            if((n&start)!=0){
                count++;
            }
            start<<=1;

        }
        if(count==1)
            return true;
        else
            return false;
    }
}

