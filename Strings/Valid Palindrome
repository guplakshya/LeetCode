########### Valid Palindrome #################

/*

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 

Constraints:

s consists only of printable ASCII characters.

*/

Java Solution:

public boolean isPalindrome(String s) {
        int h = s.length()-1;
        int l = 0;
        s = s.toLowerCase();
        while(l<h){
            char c1 = s.charAt(l);
            char c2 = s.charAt(h);
            
            if(!(c1 >='a' && c1<='z' || c1>='0' && c1 <='9')){
                l++;   
            }  
            else if(!(c2 >='a' && c2<='z' || c2 >='0' && c2 <='9')){
                h--; 
            }   
            else if(c1==c2){
                l++;
                h--;
            }
            else
                return false;
        }
        return true;
    }

