class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int idxMin = 0;
        int idxMax = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                idxMin = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                idxMax = i;
            }
        }

        int a = Math.min(idxMin, idxMax);
        int b = Math.max(idxMin, idxMax);

        int fromLeft = b + 1;
        int fromRight = n - a;
        int fromBoth = (a + 1) + (n - b);

        return Math.min(fromLeft, Math.min(fromRight, fromBoth));
    }
}