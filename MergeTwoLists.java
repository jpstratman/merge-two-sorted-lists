/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode current;
        ListNode next1 = l1;
        ListNode next2 = l2;
        
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        
        if (next1.val > next2.val) {
            head = next2;
            next2 = next2.next;
        } else {
            head = next1;
            next1 = next1.next;
        }
        
        current = head;
        
        do {
            if (next1 == null) {
                current.next = next2;
                return head;
            } else if (next2 == null) {
                current.next = next1;
                return head;
            }
            
            if (next1.val > next2.val) {
                current.next = next2;
                next2 = next2.next;
            } else {
                current.next = next1;
                next1 = next1.next;
            }
            
            current = current.next;
        } while (true);
    }
}
