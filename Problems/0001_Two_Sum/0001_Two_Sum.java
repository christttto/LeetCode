/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry){
        if(l1==null&&l2==null){
            if(carry==1){
                return new ListNode(1);
            }
            else{
                return null;
            }
        }
        else{
            int myCarry=0;
            int l1Val;
            int l2Val;
            if(l1==null){
                l1Val=0;
            }
            else{
                l1Val=l1.val;
            }
            if(l2==null){
                l2Val=0;
            }
            else{
                l2Val=l2.val;
            }
            if((l1Val+l2Val+carry)>=10){
                myCarry++;
            }
            ListNode myNode = new ListNode((l1Val+l2Val+carry)%10);
            if(l1==null){
                myNode.next = addTwoNumbersHelper(null,l2.next,myCarry);
            }
            else if(l2==null){
                myNode.next = addTwoNumbersHelper(l1.next,null,myCarry);
            }
            else{
                myNode.next = addTwoNumbersHelper(l1.next,l2.next,myCarry);
            }
            return myNode;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1,l2,0);
    }
}