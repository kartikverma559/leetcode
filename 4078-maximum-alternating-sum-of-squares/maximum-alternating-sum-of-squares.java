class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;

        int n = nums.length;

        int[] arr = new int[n];

        for(int i=0;i<nums.length;i++)
        {
            arr[i] = Math.abs(nums[i]);
        }
        
        Arrays.sort(arr);

        int half = n/2;

        for(int i=arr.length-1;i>=half;i--)
        {
            ans+=(arr[i]*arr[i]);
        }

        for(int i=0;i<half;i++)
        {
            ans-=(arr[i]*arr[i]);
        }
        
        return ans;
    }
}