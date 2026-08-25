class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int x : nums)
        {
            list.add(x);
        }

        int a=k;
         while (true) {
            if (list.contains(a)) {
                a = a + k;
            } else {
                return a;
            }
        }
       


    }
}