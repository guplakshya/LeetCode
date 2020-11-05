############### Plus One ################

/*

Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.


Example:
Input: digits = [1,2,3]
Output: [1,2,4]

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9

*/

Java Solution:

public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                digits[i] ++;
                return digits;
            }
        }
        int res[] = new int[len+1];
        res[0] =1;
        
        return res;
    }

