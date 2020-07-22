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
    public boolean isBalanced(TreeNode root) {
        if(root ==null){
            return true;
        }
        boolean lb = isBalanced(root.left);
        boolean rb = isBalanced(root.right);
        int bf = height(root.left)-height(root.right);
        return lb && rb &&(bf == 0 || bf == 1 || bf == -1);
    }
    public int height(TreeNode node){
        if(node == null){
            return -1;
        }
        int lh = height(node.left);
        int rh =height(node.right);
        return Math.max(lh,rh)+1;
    }
}



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

