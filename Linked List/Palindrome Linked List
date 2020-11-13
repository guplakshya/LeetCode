############## Palindrome Linked List ################

/*

Given a singly linked list, determine if it is a palindrome.

Example:

Input: 1->2
Output: false

*/

Java Solution:

public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode curr = head;
        ListNode prev = new ListNode(head.val);
        
        while(curr.next!= null){
            ListNode nextnode = new ListNode(curr.next.val);
            nextnode.next = prev;
            prev = nextnode;
            curr = curr.next;
        }
        
        ListNode p1 = head;
        ListNode p2 = prev;
        
        while(p1!=null){
            if(p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    
    
