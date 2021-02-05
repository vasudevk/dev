package io.dev.hackerrank;

import io.dev.objects.Node;

import java.util.function.Predicate;

/* https://www.techiedelight.com/check-skewed-binary-tree/ */
public class SkewedBinaryTree {

    // Recursive function to calculate the size of a binary tree
    public static int getSize(Node root) {
        // Base case: empty tree has size 0
        if (root == null) {
            return 0;
        }

        // recur for the left and right subtree
        return 1 + getSize(root.left) + getSize(root.right);
    }

    // Recursive function to calculate the height of a binary tree
    public static int getHeight(Node root) {
        // Base case: an empty tree has a height of 0
        if (root == null) {
            return 0;
        }

        // recur for the left and right subtree and consider the maximum depth
        return 1 + Integer.max(getHeight(root.left), getHeight(root.right));
    }

    // Function to check if each node of a binary tree has exactly one child
    static Predicate<Node> isSkewedTree = sbt -> getSize(sbt) == getHeight(sbt);

    public static void main(String[] args) {
        Node root = new Node(15);
        root.right = new Node(30);
        root.left = new Node(7);
        root.right.left = new Node(25);
        root.right.right = new Node(50);
        root.left.left = new Node(5);
        root.left.right = new Node(6);


        boolean isSkewed = isSkewedTree.test(root);
        if (isSkewed) {
            System.out.println("The binary tree is skewed");
        } else {
            System.out.println("The binary tree is not skewed");
        }
    }
}


