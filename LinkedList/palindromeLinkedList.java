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
 
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stk = new Stack<>();
        ListNode dummy = new ListNode();
        dummy = head;
        while(dummy!=null){
            stk.add(dummy);
            dummy=dummy.next;
        }
        while(!stk.empty()){
            if(stk.pop().val!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
