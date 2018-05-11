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
        if(l1==null && l2==null) return null;
        ListNode head = new ListNode(0);
        ListNode current = head;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                current.val = l1.val;
                l1 = l1.next;
            } else {
                current.val = l2.val;
                l2 = l2.next;
            }
            if(l1!=null || l2!=null){
                current.next = new ListNode(0);
                current = current.next;
            }
        }
        while(l1!=null){
            current.val = l1.val;
            if(l1.next!=null){
                current.next = new ListNode(0);
                current = current.next;
            }
            l1=l1.next;
        }
        while(l2!=null){
            current.val = l2.val;
            if(l2.next!=null){
                current.next = new ListNode(0);
                current = current.next;
            }
            l2=l2.next;
        }
        return head;
    }
}
