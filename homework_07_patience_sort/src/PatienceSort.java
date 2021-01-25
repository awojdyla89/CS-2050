/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 07 - PatienceSort
 */

import java.util.Arrays;


public class PatienceSort {
    public static final int ARRAY_MIN = 2;

    // the patience sort algorithm
    public static void patienceSort(int[] data) {
        // Checks if array is empty
        if (data.length < ARRAY_MIN) {
            System.out.println("Array is empty.");
            return;
        }
        // this is the list of stacks (each a stack of integers)
        LinkedList<Stack<Integer>> list_Of_Stacks = new LinkedList<>();

        int firstElement = data[0];
        Stack<Integer> newStack = new Stack<>();
        newStack.push(firstElement);
        list_Of_Stacks.append(newStack);

        // TODOd #1: loop through the data array and get the array's current element
        for (int i = 1; i < data.length; i++) {
            int element = data[i];
            int j = 0;

            //TODOd #2: at each iteration, find a stack available and push the array's current
            // element onto it
            for (Stack<Integer> current = list_Of_Stacks.get(0); current != null;
                 current = list_Of_Stacks.get(++j)) {
                if (current.peek() > element) {
                    current.push(element);
                    break;
                    // TODOd #3: if there isn't a stack available, create a new one, push the
                    // data array's
                    //  current element onto it, and then append the newly created stack to the
                    //  list of stacks.
                } else if (list_Of_Stacks.get(j + 1) == null) {
                    newStack = new Stack<>();
                    newStack.push(element);
                    list_Of_Stacks.append(newStack);
                    break;
                }

            }

        }
        // merge of stacks
        if (list_Of_Stacks.isEmpty())
            return;
        for (int i = 0; i < data.length; i++) {
            Stack<Integer> stackMin = list_Of_Stacks.get(0);
            int j = 0;
            for (int k = 1; k < list_Of_Stacks.size(); k++) {
                Stack<Integer> stackCurrent = list_Of_Stacks.get(k);
                if (stackCurrent.peek() < stackMin.peek()) {
                    stackMin = stackCurrent;
                    j = k;
                }
            }
            data[i] = stackMin.pop();
            if (stackMin.isEmpty())
                list_Of_Stacks.remove(j);
        }
    }


    public static void main(String[] args) {

        int[] data = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        patienceSort(data);
        System.out.println(Arrays.toString(data));


    }


}
