class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (Integer num : nums) {
            set.add(num);
        }

        for (Integer num : nums) {
            int prev = num - 1;
            int next = num + 1;
            int length = 1;

            while (set.contains(next)) {
                length++;
                set.remove(next);
                next++;
            }
            while (set.contains(prev)) {
                length++;
                set.remove(prev);
                prev--;
            }
            maxLength = Math.max(length, maxLength);
        }

        return maxLength;

    }
}