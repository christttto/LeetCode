/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //would want to create helper function to iterate over, sort of two pointer approach.
        //time complexity of O(n)
        //got rid of base case where bothe are null, because there is never a case where
        //both will be called next and be null
        if(l1==null) return l2;
        else if(l2==null) return l1;
        else{//both is remaining
            if(l1.val>l2.val){
                ListNode myListNode = new ListNode(l2.val);
                myListNode.next = mergeTwoLists(l1,l2.next);
                return myListNode;
            }
            else{//includes ties, which does not matter because we are keeping duplicates.
                ListNode myListNode = new ListNode(l1.val);
                myListNode.next = mergeTwoLists(l1.next,l2);
                return myListNode;
            }
        }
    }
}
