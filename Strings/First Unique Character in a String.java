############### First Unique Character in a String #############

/*

Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
 

Note: You may assume the string contains only lowercase English letters.

*/

Java Solution:

public int firstUniqChar(String s) {
        int [] count = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            int idx = s.charAt(i) - 'a';
            count[idx]++;
        }
        for(int i=0;i<n;i++){
            int idx = s.charAt(i) - 'a';
            if(count[idx] == 1){
                return i;
            }
        }
        return -1;
    }
    
    
