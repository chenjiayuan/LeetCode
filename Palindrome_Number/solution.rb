ram {Integer} x
# @return {Boolean}
def is_palindrome(x)
    return false if x < 0
    return true if x < 10
    
    y = 0
    tmp = x
    begin
        y = (10 * y) + (tmp % 10)
        tmp /= 10
    end until tmp == 0
    return x == y
end

