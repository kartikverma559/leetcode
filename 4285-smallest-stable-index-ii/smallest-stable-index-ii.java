class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        for(int i=0;i<n;i++)
        {
            max = Math.max(max,nums[i]);
            prefix[i] = max;
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            min = Math.min(min,nums[i]);
            suffix[i] = min;
        }

        int ans = 0;

        for(int i=0;i<n;i++)
        {
            ans = prefix[i]-suffix[i];

            if(ans<=k) return i;
        }

        return -1;
    }
}