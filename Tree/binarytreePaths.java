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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            List<String> br = new ArrayList<>();
            return br;
        }
        if(root.left == null && root.right == null){
            List<String> br = new ArrayList<>();
            br.add(root.val+"");
            return br;
        }
        List<String> res1 = binaryTreePaths(root.left);
        List<String> res2 = binaryTreePaths(root.right);
        List<String> mr = new ArrayList<>();
        for(String x:res1){
            mr.add(root.val+"->"+x);
        }
        for(String x:res2){
            mr.add(root.val+"->"+x);
        }
        return mr;
    }
}
