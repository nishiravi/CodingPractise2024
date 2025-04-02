package PracticeInterview.LeetCode;

public class BinaryTreePostOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
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
    private static void postOrder(Node rootNode) {
        if(rootNode==null)
        {
           // System.out.print("-1 ,");
            return;
        }

        postOrder(rootNode.left);
        postOrder(rootNode.right);
        System.out.print(rootNode.data+" ,");
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node rootNode=tree.buildtree(nodes);
        postOrder(rootNode);
    }
}

