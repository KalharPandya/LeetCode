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
    public ListNode middleNode(ListNode head) {
        ListNode l,r;
        l = head;
        r = head;
        while(r!=null){
            if(r.next!=null){
                r = r.next.next;
                l = l.next;
            }
            else break;
        }
        return l;
    }
}