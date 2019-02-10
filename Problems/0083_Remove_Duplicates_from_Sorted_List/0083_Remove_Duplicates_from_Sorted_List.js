/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    /*
    if(head.next==null){
        return
    }
    if(head.value==head.next.value){
        console.log(head)
        console.log(head.next)
        console.log(head.next.next)
        head.next = head.next.next
    }
    return deleteDuplicates(head.next)
    */
    let current=head
    let isEmpty=false
    while(current){
        if(current.next!==null && current.val==current.next.val){
            current.next = current.next.next
        }
        else{
            current = current.next
        }
    }
    return head
};//had to work with object operator that I was not familiar with.