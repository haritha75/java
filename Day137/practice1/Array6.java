public class Array6 {

  public static void main(String[] args) {
    int a[] = {1,5,6,3};
    System.out.println(array6(a,0));
  }
  public static  boolean array6(int[] nums, int index) {
    if(index>=nums.length)
      return false;
    if(nums[index]==6)
      return true;
    return array6(nums,index+1);

  }
  
  
}
