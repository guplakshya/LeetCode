################### Move Zeros ###################

/*

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*/

Java Solution:

public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                count++;
            }
        }
        int k = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        while(count>0){
            nums[k++] =0;
            count--;
        }
    }
    
