class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int num1 = 1;
        int num2 = 1;

        for (int i = 2; i <= n; i++) {
            int current = num1 + num2;
            num1 = num2;
            num2 = current;
        }

        return num2;
    }
}
