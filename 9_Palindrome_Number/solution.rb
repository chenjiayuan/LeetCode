# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
    return false if x < 0
    return true if x < 10
    reverse = 0
    tmp = x
    
    while tmp != 0
        reverse = (10 * reverse) + (tmp % 10)
        tmp /= 10
    end
    
    return reverse == x
end
