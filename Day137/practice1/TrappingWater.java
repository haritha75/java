import java.util.Arrays;

public class TrappingWater {

  public static void main(String[] args) {
    
    int arr[] = {3,0,3,0,4};
    CountBlocks(arr);
  }
  public static void CountBlocks(int arr[]) {

    int leftMaxArray[] = new int[arr.length];
    int rightMaxArray[] = new  int[arr.length];

    leftMaxArray[0] = arr[0];
    for(int i=1;i<arr.length;i++) {
      leftMaxArray[i] = Math.max(leftMaxArray[i-1],leftMaxArray[i]);

    }
        System.out.println(Arrays.toString(leftMaxArray));

    rightMaxArray[arr.length-1] = arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--) {
      rightMaxArray[i] = Math.max(rightMaxArray[i+1],rightMaxArray[i]);
    }
    System.out.println(Arrays.toString(rightMaxArray));
    int totalBlock =0;
    for(int i=0;i<arr.length;i++) {
      int min = Math.min(leftMaxArray[i],rightMaxArray[i]);
      totalBlock +=Math.max(0,min-arr[i]);
    }
    System.out.println(totalBlock);
  }
  
}
