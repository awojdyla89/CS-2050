/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 19 - Selection Sort (solved)
 */

import java.util.Arrays;
import java.util.Random;

public class SelectionSortSolved {

    // TODOd: implement the selection sort algorithm
    public static void selectionSort(int data[]) {
        int i = 0;
        for (int j = 0; j < data.length; j++) {
            int min = j;
            for (int k = j + 1; k < data.length; k++)
                if (data[k] < data[min])
                    min = k;
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
            i++;
        }
    }

    public static void main(String[] args) {

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
