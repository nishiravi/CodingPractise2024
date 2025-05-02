package PracticeInterview.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
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

    static class BinaryTree {
        static int idx = -1;

        public Node buildtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            } else {
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildtree(nodes);
                newNode.right = buildtree(nodes);
                return newNode;
            }
        }
    }

    private static void levelOrderTraversal(Node rootNode) {
        if (rootNode == null) {
            // System.out.print("-1 ,");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(rootNode);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println();
                if(queue.isEmpty())
                {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    queue.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    queue.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildtree(nodes);
        levelOrderTraversal(rootNode);
    }
}

