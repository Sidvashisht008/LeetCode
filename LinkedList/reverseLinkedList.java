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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stk = new Stack();
        ListNode strt = head;
        while(strt!=null){
            stk.add(strt.val);
            strt=strt.next;
        }
        strt = head;
        while(!stk.empty()){
            strt.val = stk.pop();
            strt=strt.next;
        }
        return head;
    }
}
