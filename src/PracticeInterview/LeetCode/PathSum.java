package PracticeInterview.LeetCode;

public class PathSum {
    //https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNodeTemp root, int targetSum) {
  // refer TreeNodeTemp.java
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            return targetSum==root.val;
        }

        boolean leftNode=hasPathSum(root.left, targetSum-root.val);
        boolean rightNode=hasPathSum(root.right, targetSum-root.val);
        return leftNode||rightNode;

}
}
