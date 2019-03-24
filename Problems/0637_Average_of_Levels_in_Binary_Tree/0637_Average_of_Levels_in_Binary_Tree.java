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
    public List<Double> averageOfLevels(TreeNode root) {
        //breadth first search
        //make with queue
        //if empty, then use the new queue?
        //how do I know the difference between new row
        //
        List<Double> listOfAverage = new ArrayList<Double>();
        PriorityQueue<TreeNode> q = new PriorityQueue();
        q.add(root);
        listOfAverage.add((double)root.val);
        Iterator qIter = q.iterator();
        while(qIter.hasNext()){
            TreeNode myTreeNode = qIter.next();
            if(myTreeNode.left==null&&myTreeNode.right==null){
                
            }
            else{
                q.add(myTreeNode.left);
                q.add(myTreeNode.right);
                listOfAverage.add(Math.avg(val.left,val.right));
            }
        }
        return listOfAverage;
    }
}
