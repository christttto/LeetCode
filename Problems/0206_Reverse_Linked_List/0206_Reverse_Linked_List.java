/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode reverseHelper(ListNode tail, ListNode head){
        if(head==null)return tail;
        ListNode tempNode = head.next;
        head.next = tail;
        return reverseHelper(head,tempNode);
    }
    public ListNode reverseList(ListNode head) {
        return (reverseHelper(null,head));
    }
}