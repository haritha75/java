public class SplitArrayEx {
  public static void main(String[] args) {

      int[] nums3 = {5, 2, 3};
      System.out.println(splitArray(nums3)); // Output: true
  }

  public static boolean splitArray(int[] nums) {

      return splitArrayHelper(0, nums, 0, 0);
  }

  private static boolean splitArrayHelper(int start, int[] nums, int sum1, int sum2) {
      if (start == nums.length) {
          return sum1 == sum2;
      }

      // Include the current element in the first group
      if (splitArrayHelper(start + 1, nums, sum1 + nums[start], sum2)) {
          return true;
      }

      // Include the current element in the second group
      if (splitArrayHelper(start + 1, nums, sum1, sum2 + nums[start])) {
          return true;
      }

      return false;
  }
}
