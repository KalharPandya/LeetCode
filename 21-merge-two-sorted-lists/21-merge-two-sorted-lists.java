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
        ListNode ans;
        ListNode ansHead;
        if(list1==null && list2==null){
            return null;
        }
        else if(list1==null){
            ans = list2;
            list2 = list2.next;
        }
        else if(list2==null){
            ans=list1;
            list1 = list1.next;
        }
        else if(list1.val< list2.val) {
            ans = list1;
            list1 = list1.next;
        }
        else {
            ans = list2;
            list2 = list2.next;
        }
        ansHead = ans;
        while (list1!=null && list2!=null){
            if(list1.val < list2.val){
                ans.next=list1;
                list1=list1.next;
            }
            else{
                ans.next=list2;
                list2=list2.next;
            }
            ans=ans.next;

        }
        while (list1!=null){
            ans.next=list1;
            list1=list1.next;
            if(list1==null)
                break;

            ans = ans.next;
        }
        while (list2!=null){
            ans.next=list2;
            list2=list2.next;
            if(list2==null)
                break;

            ans = ans.next;
        }
        return ansHead;
    }
}