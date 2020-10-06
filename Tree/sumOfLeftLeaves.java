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
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root,false);
    }
    public int sumLeft(TreeNode root,boolean isLeft){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right ==null){
            if(isLeft){
                return root.val;
            }else{
                return 0;
            }
        }
        int lsum = sumLeft(root.left,true);
        int rsum = sumLeft(root.right,false);
        return lsum + rsum;
    }
}
