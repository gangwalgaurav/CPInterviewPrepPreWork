/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        int False = 0;
        int True = 1;
        if(A == null)
            return True;
        //Find the mid point
        ListNode slow = A;
        ListNode fast = A;
        while(fast!=null){
            if(fast.next==null){
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        //Reverse the list from mid point
        ListNode mid = reverse(slow);
        ListNode start = A;
        while(mid!=null){
            if(start.val != mid.val){
                //Return if any of the Node between first half and reversed second half
                // is different.
                return False;
            }
            start = start.next;
            mid = mid.next;
        }
        return True;
    }
    /** Reverse the Linkedlist
     */
    public ListNode reverse(ListNode node){
        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;    	
    }
}
