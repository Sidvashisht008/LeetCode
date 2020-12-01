class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);
        return Math.max(ld,rd)+1;
    }
}
