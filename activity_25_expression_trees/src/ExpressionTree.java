/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 25 - ExpressionTree class
 */

public class ExpressionTree {

    private BinNode<Term> root;

    public ExpressionTree(Queue<Term> input) {
        root = addRecursively(input);
    }

    public boolean isEmpty() {
        return root == null;
    }

    // TODO: implement the addRecursively private method
    private BinNode<Term> addRecursively(Queue<Term> input) {

        // TODO: if the input queue is empty, return right away (nothing to do)
            if(input.isEmpty())
                return null;

        // TODO: consume one term from the input queue (e.g., pop the input queue saving the term reference)
             Term term = input.pop();

        // TODO: create a new binary node with the term
                BinNode<Term> newBinNode = new BinNode<>(term);

        // TODO: get current node's term type
                int termType = term.getType();

        // TODO: if type is operator, make recursive calls to the left and to the right, updating the left and
        //  right references of the newly created node with the returned values
                if(termType == Term.OPERATOR_TYPE){
                    newBinNode.setLeft(addRecursively(input));
                    newBinNode.setRight(addRecursively(input));
                }


        // TODO: don't forget to return the new node
        return newBinNode;
    }

    public String inOrder(final BinNode<Term> current) {
        if (current != null)
            return  inOrder(current.getLeft())  +
                    current.getData() + " "     +
                    inOrder(current.getRight());
        return "";
    }

    @Override
    public String toString() {
        return inOrder(root);
    }
}