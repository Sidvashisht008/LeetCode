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
    class pair{
        TreeNode node;
        boolean sd;
        boolean ld;
        boolean rd;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<pair> s = new Stack<>();
        pair np = new pair();
        np.node = root;
        s.push(np);
        while(!s.isEmpty()){
            pair rp = s.peek();
            if(rp.node == null){
                s.pop();
                continue;
            }
            if(rp.ld==false){
                pair temp = new pair();
                temp.node = rp.node.left;
                s.push(temp);
                rp.ld = true;
            }else if(rp.rd == false){
                pair temp = new pair();
                temp.node = rp.node.right;
                s.push(temp);
                rp.rd = true;
            }else if(rp.sd == false){
                res.add(rp.node.val);
                rp.sd = true;
            }else{
                s.pop();
            }
            
        }
        return res; 
    }  
}
