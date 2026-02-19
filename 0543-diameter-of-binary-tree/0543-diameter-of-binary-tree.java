/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*class Solution
{
    int diameter=0;
    public int maxDepth(TreeNode root)
    {
        if (root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root)
    {
        if(root==null)
            return 0;
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        int currentDiameter=leftHeight+rightHeight;
        diameter=Math.max(diameter,currentDiameter);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return diameter;
    }
}*/
class Solution {
    
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter = 0;
        longestPath(root);
        return diameter;
    }
    
    private int longestPath(TreeNode root) {
        if(root == null) return 0;
        int leftPath = longestPath(root.left);
        int rightPath = longestPath(root.right);
        
        diameter = Math.max(diameter, leftPath + rightPath);
        return Math.max(leftPath, rightPath) + 1;
    }
}