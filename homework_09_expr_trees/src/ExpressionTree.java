/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 09 - ExpressionTree class
 * Name:
 */

public class ExpressionTree {

    private BinNode<Term> root;

    public ExpressionTree(Queue<Term> input) {
        root = add(input);
    }

    public boolean isEmpty() {
        return root == null;
    }

    // TODO: implement the add private method
    private BinNode<Term> add(Queue<Term> queue) {
        //create place holders for root node and current node
        BinNode<Term> root = null;
        BinNode<Term> current = null;
        while (!queue.isEmpty()) {
            //create a new BinNode that takes in the next queue
            BinNode<Term> newBin = new BinNode<>(queue.pop());
            //if the BinNode is an Operand , set the current node to the BinNode
            // if root is not null set the root node to the right of the tree with current node
            //make current the root node
            // then clear the root node for further nodes to be checked
            if (newBin.getData().getType() == Term.OPERAND_TYPE) {
                current = newBin;

                if (root != null) {
                    root.setRight(current);
                    current = root;
                    root = null;
                }
                //else if the BinNode is an operator, we set the root node to the newNode
                //and set the root the left of the tree using the current node
            } else {
                root = newBin;
                root.setLeft(current);
            }
        }
        return current;
    }

    public String inOrder(final BinNode<Term> current) {
        if (current != null)
            return inOrder(current.getLeft()) +
                    current.getData() + " " +
                    inOrder(current.getRight());
        return "";
    }

    @Override
    public String toString() {
        return inOrder(root);
    }
}