class Solution {
    public void nextPermutation(int[] nums) {

       if(nums==null || nums.length <=1)
          return;

        int i = nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1])
          i--; //here ifnding the pivot index

        if(i>=0) {
            int j = nums.length-1;
            while(nums[j] <= nums[i])
              j--;
           swap(nums,i,j); //if you found the pivot we can swap and then reverse the values
        }
        reverse(nums,i+1); //if you not found pivot then directly reverse the values
    }
    public void swap(int a[],int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void reverse(int a[],int start) {
        int end = a.length-1;
        while(start<end) {
            swap(a,start,end);
            start++;
            end--;
        }
    }
}