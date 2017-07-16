package net.aryaman.algo.btree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreeWalker {
    private static List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

    static class BinaryTreeNode {
        public BinaryTreeNode(int data) {
            this.data = data;
        }
        int data;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;

    }
    public static void main2(String[] args) {
        TreeWalker walker = new TreeWalker();
        BinaryTreeNode root = walker.constructTree();
        traversePostOrder(root);
        System.out.println();
        traversePreOrder(root);
        System.out.println();

        traverseInOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        TreeWalker walker = new TreeWalker();

        Scanner in = new Scanner(System.in);

        System.out.println("Give the root node");
        String rn = in.nextLine();
        BinaryTreeNode root = new BinaryTreeNode(Integer.parseInt(rn));

        walker.constructBinaryTree(root, in);
        in.close();

        traversePostOrder(root);
        System.out.println();

        traversePreOrder(root);
        System.out.println();

        traverseInOrder(root);
        System.out.println();
    }

    private BinaryTreeNode constructTree() {

        BinaryTreeNode t1 = new BinaryTreeNode(1);
        BinaryTreeNode t4 = new BinaryTreeNode(4);
        BinaryTreeNode t7 = new BinaryTreeNode(7);

        t1.leftChild = t4;
        t1.rightChild = t7;

        BinaryTreeNode t2 = new BinaryTreeNode(2);
        BinaryTreeNode t6 = new BinaryTreeNode(6);

        t4.leftChild = t2;
        t4.rightChild = t6;

        BinaryTreeNode t8 = new BinaryTreeNode(8);
        BinaryTreeNode t3 = new BinaryTreeNode(3);
        t7.leftChild = t8;
        t7.rightChild = t3;

        BinaryTreeNode t12 = new BinaryTreeNode(12);
        t3.leftChild = t12;

        return t1;
    }

    private void constructBinaryTree(BinaryTreeNode node, Scanner in) {
        System.out.println("Give me the leftNode and rightNode of: " + node.data);
        String input = in.nextLine();
        String[] array = input.split(" ");
        int leftChild = Integer.parseInt(array[0]);
        int rightChild = Integer.parseInt(array[1]);

        if (leftChild != -1) {
            BinaryTreeNode leftChildNode = new BinaryTreeNode(leftChild);
            node.leftChild = leftChildNode;
            constructBinaryTree(leftChildNode, in);
        }

        if (rightChild != -1) {
            BinaryTreeNode rightChildNode = new BinaryTreeNode(rightChild);
            node.rightChild = rightChildNode;
            constructBinaryTree(rightChildNode, in);
        }
    }

    static void traversePostOrder(BinaryTreeNode t) {

        if (t.leftChild != null) {
            traversePostOrder(t.leftChild);
        }

        if (t.rightChild != null) {
            traversePostOrder(t.rightChild);
        }

        System.out.print(t.data + "  ");
    }

    static void traversePreOrder(BinaryTreeNode t) {

        System.out.print(t.data + "  ");

        if (t.leftChild != null) {
            traversePreOrder(t.leftChild);
        }

        if (t.rightChild != null) {
            traversePreOrder(t.rightChild);
        }
    }
    static void traverseInOrder(BinaryTreeNode t) {
        if (t.leftChild != null) {
            traverseInOrder(t.leftChild);
        }
        System.out.print(t.data + "  ");

        if (t.rightChild != null) {
            traverseInOrder(t.rightChild);
        }
    }

    static class BTreeNode {
        int data;
        List<BTreeNode> children = new ArrayList<>();
    }
}
