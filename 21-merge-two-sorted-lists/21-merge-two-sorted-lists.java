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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        if(list1==null && list2==null){
            return null;
        }
        
        while (list1!=null && list2!=null){
            if(list1.val < list2.val){
                ans.val=list1.val;
                list1=list1.next;
                ListNode next = new ListNode();
                ans.next = next;
                ans = next;
                if(list1==null)
                    break;
            }
            else{
                ans.val=list2.val;
                list2=list2.next;
                ListNode next = new ListNode();
                ans.next = next;
                ans = next;
                if(list2==null)
                    break;
            }
            

        }
        while (list1!=null){
            ans.val=list1.val;
            list1=list1.next;
            if(list1==null)
                break;
            ListNode next = new ListNode();
            ans.next = next;
            ans = next;
        }
        while (list2!=null){
            ans.val=list2.val;
            list2=list2.next;
            if(list2==null)
                break;
            ListNode next = new ListNode();
            ans.next = next;
            ans = next;
        }
        return ansHead;
    }
}