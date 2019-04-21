/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;
        while(currentNode!=null){
            ListNode tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        return previousNode;
        
    }
}