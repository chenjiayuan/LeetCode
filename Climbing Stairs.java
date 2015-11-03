/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

==idea==

*/

public class Solution {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return n;

        int first = 1, second = 2, sum = 0;

        for (int i=3; i<=n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }
}
