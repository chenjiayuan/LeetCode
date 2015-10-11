/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?

==idea==
in place rotation
*/

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        if (n > 1) {
            int row = n/2, col = n/2;
            if (n % 2 == 1) row++;
            
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[n-1-j][i];
                    matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                    matrix[j][n-1-i] = tmp;
                }
            }
        }
    }
}