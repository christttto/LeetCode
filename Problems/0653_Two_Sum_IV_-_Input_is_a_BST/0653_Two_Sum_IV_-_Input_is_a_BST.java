class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        Queue<TreeNode> myQ=new LinkedList<>();
        Set<Integer> myS=new HashSet<Integer>();
        myQ.add(root);
        while(!myQ.isEmpty()){
            TreeNode myN=myQ.remove();
            int myV=myN.val;
            if(myS.contains(k-myV))return true;
            else myS.add(myV);
            if(myN.left!=null)myQ.add(myN.left);
            if(myN.right!=null)myQ.add(myN.right);
        }
        return false;
    }
}