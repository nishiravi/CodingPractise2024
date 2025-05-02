package PracticeInterview.LeetCode;

public class BinaryTreePostOrder {
    // class to create a Node
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
    // class to build tree.
    static class BinaryTree{
        static int idx=-1;
        public  Node buildtree(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1) //array value at that index=-1
            {
                return null; // that means rootnode is null and its has no left  & no right child
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes); // build newnode left subtree
            newNode.right=buildtree(nodes); //build newnode right subtree
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
        System.out.println("root node data is: "+rootNode.data);
        postOrder(rootNode);
    }
}

