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
 



// Second Approach and Better one 

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
    
    class bPair{
        boolean bal = true;
        int h =-1;
    }
    
    
    public boolean isBalanced(TreeNode root) {
        return isBal(root).bal;
    }
    
    
    public bPair isBal(TreeNode node){
        if(node ==null){
            return new bPair();
        }
        bPair lb = isBal(node.left);
        bPair rb = isBal(node.right);
        bPair sb = new bPair();
        
        sb.h = Math.max(lb.h,rb.h)+1;
        int bf = lb.h - rb.h;
        
        sb.bal = lb.bal && rb.bal && (bf == -1 || bf == 0 || bf==1);
        return sb;
    }
}

