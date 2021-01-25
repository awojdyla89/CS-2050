/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 08 - BinaryTree class
 * Name:
 */

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private BinNode<T> addRecursively(BinNode<T> current, final T data) {
        if (current == null)
            return new BinNode<T>(data);
        else {
            if (data.compareTo(current.getData()) < 0)
                current.setLeft(addRecursively(current.getLeft(), data));
            else if (data.compareTo(current.getData()) > 0)
                current.setRight(addRecursively(current.getRight(), data));
            return current;
        }
    }

    public void add(final T data) {
        if (isEmpty())
            root = new BinNode<T>(data);
        else
            addRecursively(root, data);
    }

    @Override
    public String toString() {
        Queue<BinNode<T>> queue = new Queue<>();
        BinNode<T> current = root;
        queue.push(current);
        String str = "";
        while (!queue.isEmpty()) {
            current = queue.pop();
            str += current.getData() + " ";
            if (current.getLeft() != null)
                queue.push(current.getLeft());
            if (current.getRight() != null)
                queue.push(current.getRight());
        }
        return str;
    }

    private boolean searchRecursively(final BinNode<T> current, final T data) {
        if (current == null)
            return false;
        else if (data.compareTo(current.getData()) == 0)
            return true;
        else if (data.compareTo(current.getData()) < 0)
            return searchRecursively(current.getLeft(), data);
        else
            return searchRecursively(current.getRight(), data);
    }

    public boolean search(final T data) {
        return searchRecursively(root, data);
    }

    // TODOd: implement the height helper method
    private int height(final BinNode<T> current) {
        // base case, checks to see if root is null
        if (current == null)
            return 0;

        // otherwise (when root is not null)
        // set variables to hold depth from recursion on left and right subtrees
          int leftSubTree = height(current.getLeft());
           int rightSubTree = height(current.getRight());

        // return the maximum depth (left then right)
        // and add root node for complete depth
        return Math.max(leftSubTree, rightSubTree) + 1;
    }

    // TODOd: implement the isBalanced method
    public boolean isBalanced() {
        // if the root node is null return balanced
        if (root == null)
            return true;
        // create variables to hold depth results for evaluation
        int leftDepth = height(root.getLeft());
        int rightDepth = height(root.getRight());

        // compare the two depths to see if tree is balanced
        return Math.abs(leftDepth - rightDepth) <= 1;

    }

    // returns the height of the tree
    public int height() {
       return height(root);
    }
}