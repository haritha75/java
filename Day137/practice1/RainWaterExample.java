public class RainWaterExample {

  public static void main(String[] args) {
    int arr[] = {3,0,3,0,4};
    CountBlocks(arr);
  }
  public static void CountBlocks(int arr[]) {

    int left =0,right=arr.length-1;
    int leftMax=0,rightMax =0;
    int total=0;
    while(left<=right) {

      if(rightMax<=leftMax) {
        total  +=Math.max(0,rightMax - arr[right]);
        rightMax = Math.max(rightMax,arr[right]);
        right--;
      }
      else{
        total +=Math.max(0,leftMax-arr[left]);
        leftMax =Math.max(leftMax,arr[left]);
        left++;
      }
    }
    System.out.println(total);
  }
  
}
