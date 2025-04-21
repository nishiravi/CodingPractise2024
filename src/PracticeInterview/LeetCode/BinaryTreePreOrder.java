package PracticeInterview.LeetCode;

public class BinaryTreePreOrder {
   public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     public  static class BinaryTree{
         int idx=-1;
        public  Node buildtree(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    }
    private static void preOrder(Node rootNode) {
        if(rootNode==null)
        {
            //System.out.print("-1 ,");
            return;
        }
        System.out.print(rootNode.data+" ,");
        preOrder(rootNode.left);
        preOrder(rootNode.right);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node rootNode=tree.buildtree(nodes);
        preOrder(rootNode);
    }
}

