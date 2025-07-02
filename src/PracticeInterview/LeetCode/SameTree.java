package PracticeInterview.LeetCode;
public class SameTree {
    //https://leetcode.com/problems/same-tree/description/
    //1. when 2 route node are same amd has same number of leaft and rightnode with same value
    //1. when two route node are null then its same tree
    public static boolean isSameTree(TreeNodeTemp p, TreeNodeTemp q) {
        if (p == null || q == null) {
            return p == q;
        }
        boolean leftNodeCheck = isSameTree(p.left, q.left);
        boolean rightNodeCheck = isSameTree(p.right, q.right);
        return leftNodeCheck && rightNodeCheck & p.val == q.val; // same true only if leftnode value , rightnode vALUE AND ROOTNODE VALUE IS TRUE
    }
}
