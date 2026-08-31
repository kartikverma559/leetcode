class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        int index = 1;

        int firstCritical = -1;
        int prevCritical = -1;

        int minDist = Integer.MAX_VALUE;
        int maxDist = -1;

        while (next != null) {

            
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                
                if (firstCritical == -1) {
                    firstCritical = index;
                }

                
                if (prevCritical != -1) {
                    minDist = Math.min(minDist, index - prevCritical);
                    maxDist = Math.max(maxDist, index - firstCritical);
                }

                prevCritical = index;
            }

           
            prev = curr;
            curr = next;
            next = next.next;

            index++;
        }

        if (prevCritical == firstCritical) {
            return ans;
        }

        ans[0] = minDist;
        ans[1] = maxDist;

        return ans;
    }
}