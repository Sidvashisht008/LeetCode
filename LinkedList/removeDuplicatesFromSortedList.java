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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            ListNode ahead = curr.next;
            while(ahead.val == curr.val){
                ahead = ahead.next;
                if(ahead == null){
                    break;
                }
            }
            curr.next = ahead;
            curr = curr.next;
        }
        return head;
    }
}
