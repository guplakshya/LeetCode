################## Single Number ################

/*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Example:

Input: nums = [2,2,1]
Output: 1

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

*/

Java Solution:

public int singleNumber(int[] nums) {
        
        Set<Integer> set = new HashSet();
        int num_sum = 0, set_sum =0;
        for(int x: nums){
            if(!set.contains(x)){
                set.add(x);
                set_sum +=x;
            }
            num_sum+= x;
        } 
    return 2*set_sum - num_sum;
    }
