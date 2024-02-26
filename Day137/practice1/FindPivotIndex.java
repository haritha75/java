class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < n; ++i)
            sum += nums[i];
        for (int i = 0; i < n; ++i) {
            sum -= nums[i];

            if (leftSum == sum)
                return i;

            leftSum += nums[i];
        }

        return -1;

    }
}