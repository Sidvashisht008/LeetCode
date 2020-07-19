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
    public ListNode oddEvenList(ListNode head) {
        ListNode fake_head_even = new ListNode();
		ListNode fake_head_odd = new ListNode();

		ListNode even = fake_head_even;
		ListNode odd = fake_head_odd;

		ListNode temp = head;
        int i =1;
		while (temp != null) {
			if (i % 2 == 0) {
				even.next = temp;
				even = even.next;
			} else {
				odd.next = temp;
				odd = odd.next;
			}
            i++;
			temp = temp.next;

        }
        even.next=null;
		odd.next = fake_head_even.next;
        
		head = fake_head_odd.next;
		
        return head;
    }
}