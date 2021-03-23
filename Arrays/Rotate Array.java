################# Rotate Array ##############

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Constraints:

1 <= nums.length <= 2 * 104
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

*/

Java Solution:

public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        rightrotate(nums,0,n-1);
        rightrotate(nums,0,k-1);
        rightrotate(nums,k,n-1);
    }
    public void rightrotate(int[] a, int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
