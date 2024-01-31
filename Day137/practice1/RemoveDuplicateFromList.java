class Solution {
    ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null)
            return head;

        var current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}