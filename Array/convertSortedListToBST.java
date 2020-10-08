/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while(head!=null){
            nums.add(head.val);
            head = head.next;
        }
        return BST(nums,0,nums.size()-1);
    }
    
     public TreeNode BST(List<Integer> nums,int startindex,int endindex){
        if(startindex>endindex){
            return null;
        }
        TreeNode root = new TreeNode();
        int middleindex = startindex + (endindex - startindex)/2;
        root.val = nums.get(middleindex);
        root.left = BST(nums,startindex,middleindex-1);
        root.right = BST(nums,middleindex+1,endindex);
        return root;
    }
    
    
}
