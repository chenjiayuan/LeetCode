/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

==idea==

*/

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i] != 9) {
                //no carry
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        
        //the original value have all 9, need to add a digit
        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1]; //all elements are 0 by default
            result[0] = 1;
            return result;
        }
        
        return digits;
    }
}
