/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

==idea==
dp solution: represent ways to reach the point
This is a fundamental DP problem. First of all, let's make some observations.

Since the robot can only move right and down, when it arrives at a point, there are only two possibilities:

It arrives at that point from above (moving down to that point);
It arrives at that point from left (moving right to that point).
Thus, we have the following state equations: suppose the number of paths to arrive at a point (i, j) is denoted as P[i][j], it is easily concluded that P[i][j] = P[i - 1][j] + P[i][j - 1].

The boundary conditions of the above equation occur at the leftmost column (P[i][j - 1] does not exist) and the uppermost row (P[i - 1][j] does not exist). These conditions can be handled by initialization (pre-processing) --- initialize P[0][j] = 1, P[i][0] = 1 for all valid i, j. Note the initial value is 1 instead of 0!
*/

public class Solution {
    public int uniquePaths(int m, int n) {
            if (m == 0 || n == 0) return 0;
            if (m == 1 || n == 1) return 1;
    
            //create an int array: [1, 1 ... 1, 1]
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) dp[i] = 1;
            
            // [1, 2, 3, 4, 5]
            // [1, 3, 6, 10, 15]
            // [1, 4, 10, 20, 35(return this)]
            // 35 is the ways to reach this point
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[j] += dp[j - 1];
                }
            }
            return dp[n - 1];
    }
}