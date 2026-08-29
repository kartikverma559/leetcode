class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        // Store value and original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;

        while (start < n) {

            int end = start;

            // Find one connected group
            while (end + 1 < n &&
                   arr[end + 1][0] - arr[end][0] <= limit) {
                end++;
            }

            // Values in this group
            ArrayList<Integer> values = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                values.add(arr[i][0]);
            }

            // Put sorted values back into original positions
            ArrayList<Integer> indices = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                indices.add(arr[i][1]);
            }

            Collections.sort(indices);

            for (int i = 0; i < values.size(); i++) {
                nums[indices.get(i)] = values.get(i);
            }

            start = end + 1;
        }

        return nums;
    }
}