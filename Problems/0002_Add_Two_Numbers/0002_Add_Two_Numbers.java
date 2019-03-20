/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //create helperfunction for carry, always consider the carry.
    //if null but there is carry, must return new listnode with val=1
    private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry){
        if(l1==null&&l2==null){//last digit
            if(carry==1) return new ListNode(1);
            return null;
        }
        else{
            if(l1==null){//only l2 is remaining
                if((l2.val+carry)/10==1){//10
                    ListNode myNode = new ListNode(0);
                    myNode.next = addTwoNumbersHelper(null, l2.next, 1);
                    return myNode;
                }
                ListNode myNode = new ListNode(l2.val+carry);
                myNode.next = addTwoNumbersHelper(null,l2.next,0);
                return myNode;
            }
            else if(l2==null){//only l1 is remaining
                if((l1.val+carry)/10==1){//10
                    ListNode myNode = new ListNode(0);
                    myNode.next = addTwoNumbersHelper(l1.next, null, 1);
                    return myNode;
                }
                ListNode myNode = new ListNode(l1.val+carry);
                myNode.next = addTwoNumbersHelper(l1.next,null,0);
                return myNode;
            }
            else{//both remaining
                if((l1.val+l2.val+carry)/10==1){//10
                    ListNode myNode = new ListNode((l1.val+l2.val+carry)%10);
                    myNode.next = addTwoNumbersHelper(l1.next, l2.next, 1);
                    return myNode;
                }
                ListNode myNode = new ListNode(l1.val+l2.val+carry);
                myNode.next = addTwoNumbersHelper(l1.next,l2.next,0);
                return myNode;
            }
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1,l2,0);
    }
}