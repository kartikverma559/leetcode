class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {

        List<List<String>> ans = new ArrayList<>();
        int n = s1.length();

        for (int i = 0; i < n; i++) {

            char sub1 = s1.charAt(i);
            char sub2 = s2.charAt(i);

            if (sub1 != sub2) {

                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                int j = i;

                while (j < n && s1.charAt(j) != s2.charAt(j)) {
                    sb1.append(s1.charAt(j));
                    sb2.append(s2.charAt(j));
                    j++;
                }

                List<String> temp = new ArrayList<>();
                temp.add(sb1.toString());
                temp.add(sb2.toString());

                ans.add(temp);

                i = j - 1;
            }
        }

        return ans;
    }
}