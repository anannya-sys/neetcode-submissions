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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to start building the merged list
        ListNode dummy = new ListNode(0);

        // curr points to the last node in merged list
        ListNode curr = dummy;

        // Compare nodes until one list becomes empty
        while (list1 != null && list2 != null) {

            // If list1 has the smaller value
            if (list1.val < list2.val) {

                curr.next = list1;       // Add list1 node
                list1 = list1.next;       // Move list1 forward
            }
            else {

                curr.next = list2;       // Add list2 node
                list2 = list2.next;       // Move list2 forward
            }

            // Move curr to the node we just added
            curr = curr.next;
        }

        // Attach whichever list still has nodes
        if (list1 != null) {
            curr.next = list1;
        }
        else {
            curr.next = list2;
        }

        // Return actual head, skipping dummy
        return dummy.next;
    }
}