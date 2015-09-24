/*


==idea==
two pass: counting sort
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

one pass: two pointers left and right, swap
*/

// two pass O(m+n) space
public class Solution {
    public void sortColors(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) ++num0;
            else if (nums[i] == 1) ++num1;
            else if (nums[i] == 2) ++num2;
        }
    
        for(int i = 0; i < num0; ++i) nums[i] = 0;
        for(int i = 0; i < num1; ++i) nums[num0+i] = 1;
        for(int i = 0; i < num2; ++i) nums[num0+num1+i] = 2;
    }
}

// one pass in place solution
void sortColors(int A[], int n) {
    int n0 = -1, n1 = -1, n2 = -1;
    for (int i = 0; i < n; ++i) {
        if (A[i] == 0) 
        {
            A[++n2] = 2; A[++n1] = 1; A[++n0] = 0;
        }
        else if (A[i] == 1) 
        {
            A[++n2] = 2; A[++n1] = 1;
        }
        else if (A[i] == 2) 
        {
            A[++n2] = 2;
        }
    }
}

// one pass in place solution
void sortColors(int A[], int n) {
    int j = 0, k = n-1;
    for (int i=0; i <= k; i++) {
        if (A[i] == 0)
            swap(A[i], A[j++]);
        else if (A[i] == 2)
            swap(A[i--], A[k--]);
    }
}