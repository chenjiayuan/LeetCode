/*
Determine whether an integer is a palindrome. Do this without extra space.

==idea==
if it is negative, it cannot be palindrome

if it has single digit, it will always be palindrome

create a reverse variable, and push the last digit of the input to the leftmost digit of reverse, then check if they are the same at last
*/

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }
        
        int reverse = 0;
        int tmp = x;
        
        while (tmp != 0) {
            reverse = reverse * 10 + tmp % 10;
            tmp /= 10;
        }
        
        return reverse == x;
    }
}