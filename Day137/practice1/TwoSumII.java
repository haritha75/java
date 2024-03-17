class Solution {
    public int[] twoSum(int[] numbers, int target) {
        var left = 0;
        var right = numbers.length - 1;
        var currentSum = numbers[left] + numbers[right];
        while (currentSum != target) {
            if (currentSum > target) {
                right--;
            } else {
                left++;
            }
            currentSum = numbers[left] + numbers[right];
        }
        return new int[] {++left, ++right};
    }
}