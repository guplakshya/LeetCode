############### Intersection of Two Arrays II #################

/*

Given two arrays, write a function to compute their intersection.

Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.


*/

Java Solution:

public int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>(); 
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }   
            else if(nums1[i]<nums2[j])
                i++;
            else{
                j++;
            }
        }
        return listToArray(result);
    }
    private int[] listToArray(List<Integer> list){
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
