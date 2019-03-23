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
    private void binaryTreePathsHelper(List<String> myList, TreeNode node,StringBuilder prevPath) {
        if(node.left==null&&node.right==null){
            myList.add(prevPath.toString());
        }
        else if(node.left==null&&node.right!=null){//right is not null
            binaryTreePathsHelper(myList, node.right,new StringBuilder().append(prevPath).append("->"+node.right.val));
        }
        else if(node.right==null&&node.left!=null){//left is not null
            binaryTreePathsHelper(myList, node.left,new StringBuilder().append(prevPath).append("->"+node.left.val));
        }
        else{//both not null
            binaryTreePathsHelper(myList, node.left,new StringBuilder().append(prevPath).append("->"+node.left.val));
            binaryTreePathsHelper(myList, node.right,new StringBuilder().append(prevPath).append("->"+node.right.val));
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        //helper function that returns single string, extra parameter that saves prev path
        //
        if(root==null) return new ArrayList<String>();
        List<String> myPaths = new ArrayList<String>();
        StringBuilder startPath = new StringBuilder().append(root.val);
        binaryTreePathsHelper(myPaths, root, startPath);
        
        
        return myPaths;
    }
}
