public class CountSumofSubArraysToKValue {

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,1,3,1,2,9};
        int size=3;
        int k=12;
        Subarray(a,size,k);
    }
    public static void Subarray(int[] a,int size,int k) {
        
         int count=0;
        for(int i=0;i<a.length-size;i++) {
            int sum=0;
            for(int j=i;j<size+i;j++) {
                sum +=a[j];

            }
            if(sum==k) {
                count++;
            }
        }
        System.out.println(count);

    }

}
