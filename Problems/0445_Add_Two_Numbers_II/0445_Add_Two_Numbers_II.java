/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //memory heavy, but make two lists, than iterate
        //O(3n);
        ListNode nodeHead = l1;
        ArrayList<Integer>l1List=new ArrayList<Integer>();
        while(nodeHead!=null){
            l1List.add(nodeHead.val);
            nodeHead = nodeHead.next;
        }
        nodeHead=l2;
        ArrayList<Integer>l2List=new ArrayList<Integer>();
        while(nodeHead!=null){
            l2List.add(nodeHead.val);
            nodeHead = nodeHead.next;
        }
        //which one is longer?
        for(int i=0;i<=l1List.length();i++){
            if(l2List.length()-1-i>=0) l1List.get(l1List.length()-1-i)+=l2List.get(l2List.length()-1-i);
            if(l1List.get(l1List.length()-1-i)>=10){
                if(l1List.length()-i<0) l1List.add(0,1);
                else l1List.get(l1List.length()-i)+=1;
                l1List.get(l1List.length()-1-i)=l1List.get(l1List.length()-1-i)%10;
            }
        }
    }
}