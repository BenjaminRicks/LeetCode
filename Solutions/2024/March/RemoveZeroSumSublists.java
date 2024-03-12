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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null) return null;
        ListNode node = head;

        int sum = 0;
        while(node != null) {
            sum += node.val;
            if(sum == 0) {
                head = node.next;
            }
            node = node.next;
        }

        if(head != null) {
            head.next = removeZeroSumSublists(head.next);
        }

        return head;

    }

}
