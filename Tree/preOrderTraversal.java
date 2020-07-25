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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = preOrder(root,new ArrayList<Integer>());
        return res;
    }
    public List<Integer> preOrder(TreeNode node,List<Integer> res){
        Stack<pair> s = new Stack<>();
        pair np = new pair();
        np.node = node;
        s.push(np);
        
        while(!s.isEmpty()){
            pair rp = s.peek();
            if(rp.node == null){
                s.pop();
                continue;
            }
            if(rp.sd == false){
                res.add(rp.node.val);
                rp.sd = true;
            }else if(rp.ld == false){
                pair temp = new pair();
                temp.node = rp.node.left;
                s.push(temp);
                rp.ld = true;
            }else if(rp.rd == false){
                pair temp = new pair();
                temp.node = rp.node.right;
                s.push(temp);
                rp.rd = true;
            }else{
                s.pop();
            }
        }
        return res;
    }
}
