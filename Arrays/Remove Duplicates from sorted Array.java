############### Remove Duplicates from Sorted Array ################

/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.

Constraints:

0 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in ascending order.

*/

Java Solution:

public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int temp [] = new int[n];
        int j=0;
        if(n==0 || n==1)
            return n;
        
        for(int i=0;i<n-1;i++)
            if(nums[i] != nums[i+1])
                temp[j++] = nums[i];
            
        temp[j++] =nums[n-1];
        
        for(int i=0;i<j;i++)
            nums[i] = temp[i];
        return j;
    }
