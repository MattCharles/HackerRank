/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        int sum;
        int a, b;
        while(l1!=null || l2!=null){
            a = l1==null ? 0 : l1.val;
            b = l2==null ? 0 : l2.val;
            sum = a+b+carry;
            if(sum>=10){
                carry = 1;
            } else {
                carry = 0;
            }
            current.val = sum%10;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            if(l1!=null || l2!=null){
                current.next = new ListNode(0);
                current = current.next;
            } else if(carry==1){
                current.next = new ListNode(1);
                break;
            }
        }
        return head;
    }
}
