public class TrappingRainWaterExample {

  public static void main(String[] args) {
    
    int a[]   = {3, 0, 2, 0, 4};
    trappingRainWater(a,a.length);
  }
  public static void trappingRainWater(int[] arr,int n) {
    int block=0;
    int max_height=Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        max_height = Math.max(max_height,arr[i]);
        block += arr[i];
    }

    int left=0,right=n-1,total=0;
    for(int i=1;i<=max_height;i++) {
        while (arr[left]<i)
            left++;
        while (arr[right]<i)
            right--;

        total += (right-left+1);
    }

    total -= block;
    System.out.println(total);
}
}
