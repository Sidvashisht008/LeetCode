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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode strt = head;
        while(strt != null){
            size++;
            strt = strt.next;
        }
        if(size == 1 ||size == 0){
            return head;
        }
        k = k % size;
        strt = head;
        while(k -- >0){
            while(strt.next.next!=null){
                strt=strt.next; 
            }    
            ListNode first = new ListNode();
            first.val = strt.next.val;
            strt.next = null;
            first.next = head;
            head = first;   
            strt = head;
        }
        return head;
    }
}
