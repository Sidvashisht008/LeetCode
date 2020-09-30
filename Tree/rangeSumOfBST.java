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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root == null){
            return sum;
        }
        if(root.val >= L && root.val<=R){
            sum+=root.val;
        }
        sum+=rangeSumBST(root.left,L,R);
        sum+=rangeSumBST(root.right,L,R);
        return sum;
    }
}
