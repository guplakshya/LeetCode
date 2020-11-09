############## String to Integer (atoi) ################

/*

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered a whitespace character.
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 

Example:

Input: str = "42"
Output: 42

*/

Java Solution:

public int myAtoi(String s) {
        if(s == null)
            return 0;
        s = s.trim();
        if(s.length()<1)
            return 0;
        char flag = '+';
        int i=0;
        if(s.charAt(0) == '-'){
            flag = '-';
            i++;
        }
        else if(s.charAt(0) == '+'){
            i++;
        }
        
        double result = 0;
        while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            result = result*10 + (s.charAt(i) - '0');
            i++;
        }
        if(flag == '-')
            result = -result;
        
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int)result;
    }
    
    
