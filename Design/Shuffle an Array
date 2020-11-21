########## Shuffle an Array #############

/*

iven an integer array nums, design an algorithm to randomly shuffle the array.

Implement the Solution class:

Solution(int[] nums) Initializes the object with the integer array nums.
int[] reset() Resets the array to its original configuration and returns it.
int[] shuffle() Returns a random shuffling of the array.
 

Example 1:

Input
["Solution", "shuffle", "reset", "shuffle"]
[[[1, 2, 3]], [], [], []]
Output
[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

Constraints:

1 <= nums.length <= 200
-106 <= nums[i] <= 106
All the elements of nums are unique.
At most 5 * 104 calls will be made to reset and shuffle.

*/

Java Solution:

private int[] array;
    private int[] original;
    Random rand = new Random();
    
    private int randRange(int min,int max){
        return rand.nextInt(max-min) + min;
    }
    private void swap(int i,int j){
        int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }
    public Solution(int[] nums) {
        array = nums;
        original = nums.clone();
    }
   
    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }
    
    public int[] shuffle() {
        for(int i=0;i<array.length;i++)
            swap(i,randRange(i,array.length));
        return array;
    }
