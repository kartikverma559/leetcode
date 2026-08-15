class Solution {
    public int longestSubsequence(int[] nums) {
        int result = 0;
        boolean nonZero = false;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];

            if (nums[i] != 0) {
                nonZero = true;
            }
        }

        if (result != 0) {
            return nums.length;
        }

        if (nonZero) {
            return nums.length - 1;
        }

        return 0;
    }
}