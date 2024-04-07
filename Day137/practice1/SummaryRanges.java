import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> summaryRanges(int[] nums) {
      List<String> minRanges = new ArrayList<>();
      int n = nums.length;
      if(0 == n) return minRanges;
      int start = nums[0];
      int end = nums[0];
      for(int i = 1; i < n; i++) {
          if(end + 1 == nums[i]) {
              end++;
          }
          else {
              String range = "" + start + (start == end ? "" : "->"+end);
              minRanges.add(range);
              start = nums[i];
              end = nums[i];
          }
      }
      String range = "" + start + (start == end ? "" : "->"+end);
      minRanges.add(range);
      return minRanges;
      
  }
}