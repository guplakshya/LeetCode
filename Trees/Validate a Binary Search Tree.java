############ Validate a Binary Search Tree #############

/*

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example:
Input: [2,1,3]
Output: true

*/

Java Solution;

public boolean isValidBST(TreeNode root) {
        return isValidBSTUtil(root,null,null);
    }
    public boolean isValidBSTUtil(TreeNode node,Integer min,Integer max){
        if(node == null)
            return true;
        int val = node.val;
        if((min!=null && val <= min) || (max!= null && val>=max))
            return false;
        if(!isValidBSTUtil(node.right,val,max)) return false;
        if(!isValidBSTUtil(node.left,min,val)) return false;
        return true;
    }
    
    
