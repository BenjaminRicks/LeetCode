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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;
        ListNode remNode = head;
        ListNode remPrev = head;
        while(node != null) {
            node = node.next;
            if(n != 0) {
                n--;
            }
            else{
                remPrev = remNode;
                remNode = remNode.next;
            }
        }
        if(remPrev == remNode) return head.next;
        remPrev.next = remNode.next;
        return head;

    }
}
