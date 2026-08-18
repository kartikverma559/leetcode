class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<=nums.length-k;i++)
        {
            HashSet<Integer> st=new HashSet<>();

            for(int j=i;j<i+k;j++)
            {
                st.add(nums[j]);
            }

            for(int x : st)
            {
                mpp.put(x,mpp.getOrDefault(x,0)+1);
            }
        }

        int max=-1;
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet())
        {
            if(entry.getValue() == 1)
            {
                max=Math.max(entry.getKey(),max);
            }
        }
        
        return max;
    }
}