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
            System.out.println("lastDigit"+carry);
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
            ListNode myNode = addTwoNumbersHelper(null,l2.next,0);
            return myNode;
        }
        else if(l2==null){
            if(carry==1){
                l1.val++;
            }
            ListNode myNode = addTwoNumbersHelper(l1.next,null,0);
            return myNode;
        }
        else{
            System.out.println("sanity check:"+15%10);
            int myCarry=0;
            if((l1.val+l2.val+carry)>=10){
                System.out.println(l1.val+l2.val+carry);
                myCarry++;
            }
            System.out.println("myCarry"+myCarry);
            ListNode myNode = new ListNode((l1.val+l2.val+carry)%10);
            myNode.next = addTwoNumbersHelper(l1.next,l2.next,myCarry);
            return myNode;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1,l2,0);
    }
}