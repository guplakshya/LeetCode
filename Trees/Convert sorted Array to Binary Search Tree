########## Convert Sorted Array to Binary Search tree #########

/*

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5]

*/

Java Solution:

public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int[] arr,int start,int end){
        if(start>end)
            return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr,start,mid-1);
        root.right = helper(arr,mid+1,end);
        return root;
    }
    
    
    
