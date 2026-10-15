class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for(int i=0;i<nums.size();i++)
        {
            int cnt = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for(int j=i;j<nums.size();j++)
            {
                if(!list.contains(nums.get(j))) 
                {
                    list.add(nums.get(j));
                    cnt++;
                }

                ans += cnt * cnt; 
            }

        }

        return ans;
    }
}