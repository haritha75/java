class Solution {
  public int[] twoSum(int[] nums, int target) {

      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++) {
          map.put(nums[i],i);
      }

      for(int i=0;i<nums.length;i++) {
              int cur=target-nums[i];
      

              if(map.containsKey(cur)&& map.get(cur)!=i) {
                  return new int[] {i,map.get(cur)};
              }

      }       
      return new int[]{-1,-1};
  }
}