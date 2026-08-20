class Solution {
    public int[] resultArray(int[] nums) {
        int[] result = new int[nums.length];

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        int idx = 0 ;

        for(int i = 2 ; i < nums.length ; i++ )
        {
            if(list1.get(list1.size()-1) > list2.get(list2.size()-1))
            {
                list1.add(nums[i]);
            }
            else list2.add(nums[i]);

            
        }

        for(int i = 0 ; i < list1.size() ; i++)
        {
            result[idx++] = list1.get(i) ; 
        }
        
        for(int i = 0 ; i < list2.size() ; i++)
        {
            result[idx++] = list2.get(i) ;
        }


        return result ;

        
    }
}