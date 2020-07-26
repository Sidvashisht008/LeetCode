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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
        if(plo>phi || ilo>ihi){
				return null;
			}
			TreeNode np = new TreeNode();
			np.val = post[phi];
			int si = -1;
			int ele = 0;
			for(int i = ilo;i<=ihi;i++){
				if(np.val == in[i]){
					si = i;
					break;
				}
				ele++;
			}
			np.left = build(post,plo,plo+ele-1,in,ilo,si-1);
			np.right = build(post,plo+ele,phi-1,in,si+1,ihi);
			return np;
    }
}
