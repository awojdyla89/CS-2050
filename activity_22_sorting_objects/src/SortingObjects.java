/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Motaimport java.util.*;
 * Description: Activity 22 - SortingObjects class
 */

import java.io.*;
import java.util.*;

public class SortingObjects {

    private static final String NAMES_FILENAME = "names.txt";

    // TODO: merge the two given lists returning a new list with the elements sorted
    public static LinkedList<Student> merge(LinkedList<Student> left, LinkedList<Student> right) {
        int i = 0;
        int j = 0;
        LinkedList<Student> allStudents = new LinkedList<>();
        while(i < left.size() && j < right.size()){
            Student leftStudent = left.get(i);
            Student rightStudent = right.get(j);
            if(leftStudent.compareTo(rightStudent) < 0){
                allStudents.append(leftStudent);
                i++;
            }else{
                allStudents.append(rightStudent);
                j++;
            }
        }
        while (i < left.size()) {
            Student leftStudent  = left.get(i++);
            allStudents.append(leftStudent);
        }
        while (j < right.size()) {
            Student rightStudent  = right.get(j++);
            allStudents.append(rightStudent);
        }

        left.clear();
        right.clear();
        return allStudents;

    }

    // TODO: implement merge sort using a linked list
    public static LinkedList<Student> mergeSort(LinkedList<Student> students) {

        // TODO: implement the base case
        if(students.size() <= 1){
            return students;
        }

        // TODO: divide the students list into two lists: left and right
            int middle = students.size() / 2;
            LinkedList<Student> left = new LinkedList<>();
        for (int i = 0; i < middle ; i++) {
            left.append(students.get(i));
        }
        LinkedList<Student> right = new LinkedList<>();
        for (int i = middle; i < students.size() ; i++) {
            right.append(students.get(i));
        }


        // TODO: recursively call mergeSort w/ left and right linked lists
            left = mergeSort(left);
            right = mergeSort(right);

        // TODO: return the result of merging left and right linked lists
        return merge(left , right);
    }

    public static void main(String[] args) throws FileNotFoundException {

        LinkedList<Student> students = new LinkedList<>();
        Scanner in = new Scanner(new FileInputStream(NAMES_FILENAME));
        int id = 1;
        while (in.hasNextLine()) {
            String name = in.nextLine();
            Student student = new Student(id, name);
            students.append(student);
            id++;
        }
        in.close();
        System.out.println(students);
        LinkedList<Student> studentsSorted = mergeSort(students);
        System.out.println(studentsSorted);
    }
}

