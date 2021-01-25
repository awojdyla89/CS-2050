/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 24 - BinaryTreeDriver class
 */

public class BinaryTreeDriver {

    public static void main(String[] args) {
        BinaryTree<Integer> btree = new BinaryTree<>();
        btree.add(4);
        btree.add(2);
        btree.add(6);
        btree.add(1);
        btree.add(3);
        btree.add(5);
        btree.add(7);
        System.out.println(btree);
    }
}