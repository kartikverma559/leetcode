class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {

            HashMap<Character,Integer> mpp=new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);

                mpp.put(ch,mpp.getOrDefault(ch,0)+1);

                if(mpp.get(ch)>2)
                {
                    break;
                }
                maxLength=Math.max(maxLength , j-i+1);
            }
            
        }   

        return maxLength;
    }
}