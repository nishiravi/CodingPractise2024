package PracticeInterview.LeetCode;

public class HeightOFNode {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
       static int idx=-1;
        public static Node buildTree(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static int heightNode(Node rootNode) {
     if(rootNode==null)
     {
         return 0;
     }
     int leftHeight=heightNode(rootNode.left);
     int rightHeight=heightNode(rootNode.right);
     int maxHeight=Math.max(leftHeight,rightHeight)+1;
     return maxHeight;
    }
    public static void main(String[] args) {
        int[] nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node rootNode=tree.buildTree(nodes);
        System.out.print("height of node "+heightNode(rootNode));
    }


}
