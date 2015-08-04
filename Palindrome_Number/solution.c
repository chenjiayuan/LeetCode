bool isPalindrome(int x) {
    if (x < 0) return false;
    if (x < 10) return true;
    
    int reverse = 0, tmp = x;
    
    while(tmp) {
        reverse = reverse * 10 + tmp % 10;
        tmp /= 10;
    }

    return x == reverse;
}
