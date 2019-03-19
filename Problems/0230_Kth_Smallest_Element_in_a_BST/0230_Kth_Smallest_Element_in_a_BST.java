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

			Also, the stack was used to keep opening the node
			until the left was empty. Then, the first node without
			left was examined, because that must have been
			the smallest.
			then, the right of that node was examined,
			because the leaf will always be smaller than the
			super root, by the definition of the tree.
    	*/
    }
}