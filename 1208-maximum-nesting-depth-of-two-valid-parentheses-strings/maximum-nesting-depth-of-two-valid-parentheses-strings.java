class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int a = 0 ;
        int[] arr = new int[seq.length()];

        for(int i = 0;i<seq.length();i++)
        {
            char ch = seq.charAt(i);

            if(ch == '(')
            {
                ++a;
                arr[i] = a % 2;
            }
            else
            {
                arr[i] = a % 2;
                --a;
            }
        }
        return arr;
    }
}