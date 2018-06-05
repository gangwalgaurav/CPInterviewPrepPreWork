/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        
        ListNode fast = A;
        ListNode slow = A;
        int count =0;
        while(B>count){
            //If B is larger than the List size, delete first node.
            if (fast==null) {
                return A.next;
            }
            count++;
            fast = fast.next;
        }
        //If we have to remove the first node
        if(fast == null){
            return A.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return A;
    }
}
