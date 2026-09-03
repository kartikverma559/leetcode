class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallest = Integer.MAX_VALUE;

        int n = nums1.length;

        int[] nums2 = new int[n];

        for(int x : nums1)
        {
            smallest = Math.min(smallest,x);
        }

        if(smallest % 2 != 0)
        {
            for(int i = 0 ;i<n;i++)
            {
                if((smallest == nums1[i]) || nums1[i]%2!=0)
                {
                    nums2[i]=nums1[i];
                }
                else if((nums1[i]-smallest) >= 1 && (nums1[i]-smallest) % 2 != 0)
                {
                    nums2[i] = nums1[i] - smallest;
                }
                else 
                {
                    return false;
                }
            }
        }

        else 
        {
            for(int i=0;i<n;i++)
            {
                if(smallest==nums1[i] || nums1[i]%2==0)
                {
                    nums2[i] = nums1[i];
                }

                else if((nums1[i]-smallest>=1) && (nums1[i]-smallest)%2 ==0)
                {
                    nums2[i]=nums1[i]-smallest;
                }

                else
                {
                    return false;
                }
            }
        }

        return true;
    }
}