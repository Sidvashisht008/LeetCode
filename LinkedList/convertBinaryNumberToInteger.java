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
    public int getDecimalValue(ListNode head) {
        LinkedList<Integer> res = new LinkedList<>();
        while(head!=null){
            res.add(head.val);
            head = head.next;
        }
        int ans = 0;
        int mul = 1;
        while(res.size()!=0){
            ans+=res.removeLast()*mul;
            mul*=2;
        }
        return ans;
    }
}
