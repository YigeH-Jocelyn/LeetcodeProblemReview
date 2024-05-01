// Notes by Yige Huang
// Explained each step for better understanding for beginners
// Lets learn C++ together

**************************************************************************************************************************************************************************************
class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0 || x != 0 && x % 10 == 0) {
            return false;
// If x is smaller than 0, or if the last digit of a non-zero x is 0, x cannot be a palindrome
        }
        int reverse = 0;
// initiate a variable representing the reverse value of x
        while (x > reverse) {
            reverse == x % 10 + reverse * 10;
            x /= 10;
// The operator % gives the reminder of a division
// For iteration 1, reverse 1 = the last digit of x + 0, x1 = x/10
// For iteration 2, reverse 2 = the last digit of x1 + reverse 1, x2 = x1/10
// For iteration 3, reverse 3 = the last digit of x2 + reverse 2, x3 = x2/10      
        }
        return (x == reverse) || (x == reverse / 10);
// For examples, x=1221, a=1234, y=121, z=321, u=11, v=21, all of these numbers will pass the first loop
// Iter 1: reverse 1 = 1 & x1 = 122 | iter 2: reverse 2 = 2 + 1*10 = 12 & x2 = 12 | At this time, x is not larger than reverse, the loop ends, return true.
// Iter 1: reverse 1 = 4 & x1 = 123 | iter 2: reverse 2 = 3 + 4*10 = 43 & x2 = 12 | At this time, x is not larger than reverse, the loop ends, return false.
// Iter 1: reverse 1 = 1 & x1 = 12 | iter 2: reverse 2 = 2 + 1*10 = 12 & x2 = 1 | At this time, x is not larger than reverse, the loop ends, return true. 
// Iter 1: reverse 1 = 1 & x1 = 32 | iter 2: reverse 2 = 2 + 1*10 = 12 & x2 = 2 | At this time, x is not larger than reverse, the loop ends, return false. 
    }
};
*****************************************************************************************************************************************************************************************
