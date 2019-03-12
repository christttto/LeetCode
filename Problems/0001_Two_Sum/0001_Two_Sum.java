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
        else if(l1==null){
            int myCarry=0;
            if(carry==1){
                l2.val++;
                if(carry+l2.val>=10){
                    myCarry++;
                }
            }
            ListNode myNode = new ListNode((carry+l2.val)%10);
            myNode.next = addTwoNumbersHelper(null,l2.next,myCarry);
            return myNode;
        }
        else if(l2==null){
            int myCarry=0;
            if(carry==1){
                l1.val++;
                if(carry+l1.val>=10){
                    myCarry++;
                }
            }
            ListNode myNode = new ListNode((carry+l1.val)%10);
            myNode.next = addTwoNumbersHelper(l1.next,null,myCarry);
            return myNode;
        }
        else{
            int myCarry=0;
            if((l1.val+l2.val+carry)>=10){
                myCarry++;
            }
            ListNode myNode = new ListNode((l1.val+l2.val+carry)%10);
            myNode.next = addTwoNumbersHelper(l1.next,l2.next,myCarry);
            return myNode;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1,l2,0);
    }
}