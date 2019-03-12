/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
        ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry){
        if(l1==null&&l2==null){
            if(carry==1){
                return new ListNode(1);
            }
            else{
                return null;
            }

        }
        else if(l1==null){
            if(carry==1){
                l2.val++;
            }
            return l2;
        }
        else if(l2==null){
            if(carry==1){
                l1.val++;
            }
            return l1;
        }
        else{
            int myValue = (l1.val+l2.val+carry)%10;
            System.out.println(myValue);
            System.out.println("sanity check:"+15%10);
            int myCarry=0;
            if((l1.val+l2.val+carry)>=10){
                System.out.println(l1.val+l2.val+carry);
                myCarry++;
            }
            ListNode myNode = new ListNode(myValue);
            myNode.next = addTwoNumbersHelper(l1.next,l2.next,myCarry);
            return myNode;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //recursion
        //grabs the myNode(l1.val+l2.val%10 )
        //for the next integer, add roundDown(l1.val+l2.val/10)
        
        //if both node null, return nothing
        //if one node null, return the other node
        return addTwoNumbersHelper(l1,l2,0);
    }
}