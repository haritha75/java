public class SmallestRepeatingNumber {
    public static void main(String[] args) {
        
        int count=1;
        int small=Integer.MAX_VALUE;
        int arr[]={3,5,6,7,7,7,8,9,13};
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]==arr[i+1]) {
                count++;
            }
            else {
                if(count>1) {
                    if(small<arr[i]) {

                       small=arr[i];
                    }
                }
            }
        }
    }

}