class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        int left = 0;
        int right = s1.length();

        while (right <= s2.length()) {
            char[] ss = s2.substring(left, right).toCharArray();
            Arrays.sort(ss);
            if (Arrays.equals(c1, ss)) {
                return true;
            }
            left++;
            right++;
        }

        return false;
    }
}
