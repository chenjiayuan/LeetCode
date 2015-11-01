/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

==idea==
algorithm that operates on arrays: it starts at the left end (element A[1]) 
and scans through to the right end (element A[n]), keeping track of the maximum 
sum subvector seen so far. The maximum is initially A[0]. Suppose we've solved 
the problem for A[1 .. i - 1]; how can we extend that to A[1 .. i]? The maximum 
sum in the first I elements is either the maximum sum in the first i - 1 elements 
(which we'll call MaxSoFar), or it is that of a subvector that ends in position i 
(which we'll call MaxEndingHere).

*/

public class Solution {
    public static int maxSubArray(int[] A) {
        int maxSoFar = A[0], maxEndingHere = A[0];
        for (int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(maxEndingHere+A[i], A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere); 
        }
        return maxSoFar;
    }
}