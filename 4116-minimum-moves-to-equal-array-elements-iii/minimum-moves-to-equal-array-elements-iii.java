class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int x : nums)
        {
            max = Math.max(x,max);
        }

        int ans = 0;
        
        for(int x : nums)
        {
            ans += max - x;
        }
        
        return ans;
    }
}