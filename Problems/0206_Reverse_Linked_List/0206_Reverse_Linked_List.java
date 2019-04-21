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
        if(head==null)return null;
        ArrayList<Integer> myNodes = new ArrayList<Integer>();
        while(head!=null){
            myNodes.add(head.val);
            head = head.next;
        }
        ListNode reversedNode = new ListNode(myNodes.get(myNodes.size()-1));
        ListNode nodeHead = reversedNode;
        for(int i=myNodes.size()-2;i>=0;i--){
            ListNode nextNode = new ListNode(myNodes.get(i));
            nodeHead.next = nextNode;
            nodeHead = nextNode;
        }
        return reversedNode;
        
    }
}