public class GroupSumClump {

  public static void main(String[] args) {
    int a[] = {2,4,8};
    System.out.println(groupSumClump(0, a, 10));
  }

  public static boolean groupSumClump(int start, int[] nums, int target) {
    if(target ==0)
       return true;
     else if (start >= nums.length) {
              return false;
          }
  
          // Find the extent of identical values
          int end = start;
          while (end < nums.length && nums[end] == nums[start]) {
              end++;
          }
  
          // Choose all identical values or none and recursively check
          if (groupSumClump(end, nums, target - (end - start) * nums[start])) {
              return true;
          }
  
          if (groupSumClump(end, nums, target)) {
              return true;
          }
  
          return false;
    
  }
  
  
}
