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
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode node = head;
//         ListNode slow = head;
//         boolean incSlow = true;

//         while(node.next != null) {
//             node = node.next;
//             if(incSlow) slow = slow.next;
//             incSlow = !incSlow;
//         }
//         return slow;
//     }
// }

class Solution {
    public ListNode middleNode(ListNode head) {
        int nodeCount = 1;
        ListNode node = head;
        while(node.next != null){
            node = node.next;
            nodeCount++;
        }

        node = head;
        for(int i = 0; i < nodeCount/2; ++i) {
            node = node.next;
        }
        return node;

    }
}
