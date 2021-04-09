############### Implement strStr() ##################

/*

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example:

Input: haystack = "hello", needle = "ll"
Output: 2

*/

Java Solution:

public int strStr(String haystack, String needle) {
        int needle_length = needle.length();
        if(needle_length == 0){
            return 0;
        }
        if(haystack.contains(needle))
            return haystack.indexOf(needle,0);
        return -1;
    }
