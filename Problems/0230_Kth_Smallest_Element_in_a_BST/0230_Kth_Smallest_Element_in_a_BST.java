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
    	/*
			So what it was, a variation of tree search
			in order of Left, Root, Right.
			It also needed a counter outside to see
			how many search had to be made.
			that is where the i is being used.
			The moment counter hits k,
			it knows that this will be the kth
			smallest.
			Therefore, the value of that node was
			returned immediately.
    	*/
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