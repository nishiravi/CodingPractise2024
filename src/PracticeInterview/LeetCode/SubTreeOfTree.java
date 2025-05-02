package PracticeInterview.LeetCode;

//public class SubTreeOfTree {
//    public static boolean isSubTree(TreeNode treeRoot, SubTree subRoot) {
//        if (subRoot == null) {
//            return true;
//        }
//        if (treeRoot == null) {
//            return false;
//        }
//        if (isidentical(treeRoot, subRoot)) {
//            return true;
//        }
//        return isSubTree(treeRoot.left, subRoot.left) || isSubTree(treeRoot.right, subRoot.right)
//    }
//
//    public static boolean isidentical(TreeNode treeRoot, SubTree subRoot) {
//        if (subRoot == null && treeRoot == null) {
//            return true;
//        }
//        if (subRoot == null || treeRoot == null) {
//            return false;
//        }
//        if (treeRoot.data != subRoot.data) {
//            return isidentical(treeRoot.left, subRoot.left) && isidentical(treeRoot.right, subRoot.right)
//        }
//return false;
//    }
//}
