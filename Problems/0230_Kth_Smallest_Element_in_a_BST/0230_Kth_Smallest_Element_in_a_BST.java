/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //bst
        //helper function to iterate
        //create priority queue and have k elements
        //or even, find the root of the left most leaf
        //dfs k times
        //assign local value to root,
        //execute k times where it would return value of the next lowest
        int i = 0;
        TreeNode myNode = root;
        Stack<TreeNode> myStack = new Stack<TreeNode>();

        while(!myStack.isEmpty()||myNode!=null){
            if(myNode!=null){
            	myStack.push(myNode);
            	myNode = myNode.left;
            }
            else{
                TreeNode minNode = myStack.pop();
                i++;
                if(i==k) return minNode.val;
                myNode = minNode.right;
            }
        }
        return root.val;
    }
}