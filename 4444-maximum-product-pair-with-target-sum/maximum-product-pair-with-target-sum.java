class Solution {
    public int[] maxProductPair(int[] nums, int target) {
       int prod = Integer.MIN_VALUE;

       int[] ans = {-1,-1};
       int sum = 0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=0;j<nums.length;j++)
        {
            if(i==j) continue;
            if(nums[i]+nums[j]==target && nums[i]>nums[j]) 
            {
                if(prod<(nums[i] * nums[j]))
                {
                    prod = nums[i]*nums[j];
                    ans[0]=i;
                    ans[1]=j;
                }

            }
        }
       } 
       return ans;
    }
}