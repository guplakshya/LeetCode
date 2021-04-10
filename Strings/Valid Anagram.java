############### Valid Anagram ################

/*

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

*/

Java Solutions:

public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char [] c1 = s.toCharArray();
            char [] c2 = t.toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            boolean result = Arrays.equals(c1,c2);
            
            if(result)
                return true;
            else
                return false;
        }
        return false;
    }
    
    
