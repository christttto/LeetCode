/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
    //both empty
    if (!p && !q) {return true;}
    //only one of them is empty, return false
    if((!p&&q)||(p&&!q)){return false;}
    if(p.val!=q.val){return false;}
    return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right)
};