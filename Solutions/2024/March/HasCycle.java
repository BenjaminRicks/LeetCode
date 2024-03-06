/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         Set<ListNode> set = new HashSet<>();

//         ListNode node = head;
//         while(node != null && set.add(node)) {
//             node = node.next;
//         }
//         return node != null;
//     }
// }

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode step1 = head;
        ListNode step2 = head;
        while(step2.next != null && step2.next.next != null) {
            step1 = step1.next;
            step2 = step2.next.next;
            if(step1 == step2) return true;
        }
        return false;
    }
}
