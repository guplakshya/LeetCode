############### Remove Nth Node From End of List ##############

/*

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

*/

Java Solution:

public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        for(int i=1;i<=n+1;i++)
            first = first.next;
        
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
    
    
