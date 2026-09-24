class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum = sumOfDigits(nums[i]);
            if(sum == i)  min = Math.min(i,min);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    int sumOfDigits(int n)
    {
        if(n<=9) return n;
        int sum = 0 ;
        while(n>0)
        {
            int ld = n%10;
            sum += ld;
            n /= 10;
        }

        return sum;
    }
}