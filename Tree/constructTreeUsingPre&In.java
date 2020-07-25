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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder,int plo,int phi,int[] inorder,int ilo,int ihi){
        if(plo>phi || ilo>ihi){
            return null;
        }
        
        TreeNode node = new TreeNode();
        node.val = preorder[plo];
        int ele = 0;
        int si =-1;
        for(int i = ilo;i<=ihi;i++){
            if(node.val == inorder[i]){
                si = i;
                break;
            }
            ele++;
        }
        node.left = build(preorder,plo+1,plo+ele,inorder,ilo,si-1);
        node.right = build(preorder,plo+ele+1,phi,inorder,si+1,ihi);
        return node;
        
    }
}
