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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sorted = new ListNode(0);
        ListNode head = sorted;
        
        ListNode head1 = l1;
        ListNode head2 = l2;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                sorted.next = l1;
                l1=l1.next;
            }else{
                sorted.next = l2;
                l2=l2.next;
            }
            sorted = sorted.next;
        }
        while(l1!=null){
            sorted.next = l1;
            sorted = sorted.next;
            l1=l1.next;
        }
        while(l2!=null){
            sorted.next = l2;
            sorted = sorted.next;
            l2=l2.next;
        }
        return head.next;
    }
}