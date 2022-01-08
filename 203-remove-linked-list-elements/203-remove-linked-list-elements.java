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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode ans;
        if(head==null)
            return null;
        while(head!=null && head.val == val)
            head = head.next; 
        ans = head;
        while(head!=null){
            if(head.val == val){
                prev.next = head.next;
            }
            else
                prev = head;
            head = head.next;
        }
        return ans;
    }
}