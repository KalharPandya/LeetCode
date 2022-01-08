/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<String> set = new HashSet<>();
        while (true){
            if(head==null)
                return false;
            if(!set.add(head.toString()))
                return true;
            if(head.next==null)
                return false;
            head = head.next;

        }
    }
}