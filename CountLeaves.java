class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class CountLeaves {

    // Recursive function to count leaf nodes
    int countLeaves(Node node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeaves(node.left) + countLeaves(node.right);
    }

    public static void main(String[] args) {
        CountLeaves tree = new CountLeaves();
        
        // Creating a sample tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int leafCount = tree.countLeaves(root);
        System.out.println("Number of leaf nodes: " + leafCount);
    }
}
