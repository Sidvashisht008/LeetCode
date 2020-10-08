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
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
    public TreeNode BST(int[] nums,int startindex,int endindex){
        if(startindex>endindex){
            return null;
        }
        TreeNode root = new TreeNode();
        int middleindex = startindex + (endindex - startindex)/2;
        root.val = nums[middleindex];
        root.left = BST(nums,startindex,middleindex-1);
        root.right = BST(nums,middleindex+1,endindex);
        return root;
    }
}
