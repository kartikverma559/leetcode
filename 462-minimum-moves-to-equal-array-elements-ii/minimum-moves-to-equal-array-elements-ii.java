class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int mn = nums[n/2];
        int sum = 0;

        for(int x : nums)
        {
            sum+=(int)Math.abs(x-mn);
        }

        return sum;
    }
}