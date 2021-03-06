############# Maximum depth of binary tree #############

/*

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7]
return its depth = 3.

*/

Java Solution:

 public int maxDepth(TreeNode root) {
        if(root == null) 
            return 0;
        else{
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            
            if(l>r)
                return (l+1);
            else
                return (r+1);
        }
    }
