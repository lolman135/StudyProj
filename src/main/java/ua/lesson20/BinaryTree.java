package ua.lesson20;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Preorder:");
        tree.traversalPreorder(tree.root);
        System.out.println("\nInorder:");
        tree.traversalInorder(tree.root);
        System.out.println("\nPostorder:");
        tree.traversalPostorder(tree.root);
    }

    public void traversalPreorder(Node node) {
        if (node != null) {
            System.out.println(" " + node.key);
            traversalPreorder(node.left);
            traversalPreorder(node.right);
        }
    }

    public void traversalInorder(Node node) {
        if (node != null) {
            traversalInorder(node.left);
            System.out.println(" " + node.key);
            traversalInorder(node.right);
        }
    }

    public void traversalPostorder(Node node){
        if (node != null){
            traversalPostorder(node.left);
            traversalPostorder(node.right);
            System.out.println(" " + node.key);
        }
    }
}
