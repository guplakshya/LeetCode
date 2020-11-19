########## Maximum Subarray ##########

/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6

Constraints:

1 <= nums.length <= 2 * 104
-231 <= nums[i] <= 231 - 1

*/

Java Solution:

public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;
        for(int i=0;i<nums.length;i++){
            max_end_here += nums[i];
            if(max_end_here > max_so_far)
                max_so_far = max_end_here;
            if(max_end_here < 0)
                max_end_here = 0;
        }
        return max_so_far;
    }
