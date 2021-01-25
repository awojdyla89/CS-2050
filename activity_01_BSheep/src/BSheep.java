/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 01 - BSheep
 */

import java.util.Scanner;

public class BSheep {

    final static int MIN_SHEEP = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nSheep = sc.nextInt();

        // validate nSheep
        if (nSheep < MIN_SHEEP) {
            System.out.println("Invalid input! We need at least " + MIN_SHEEP + " sheep to build a fence!");
            System.exit(1);
        }

        int xMin, xMax, yMin, yMax;

        // reading the 1st coordinate, using it to initialize min, max values
        xMin = xMax = sc.nextInt();
        yMin = yMax = sc.nextInt();

        // read the remaining coordinates
        for (int i = 1; i <= nSheep - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < xMin)
                xMin = x;
            if (x > xMax)
                xMax = x;
            if (y < yMin)
                yMin = y;
            if (y > yMax)
                yMax = y;
        }

        System.out.print("Fence Coordinates: {(" + xMin + "," + yMin + "), ");
        System.out.print("(" + xMax + "," + yMin + "), ");
        System.out.print("(" + xMax + "," + yMax + "), ");
        System.out.println("(" + xMin + "," + yMax + ") ");

    } // end of main function

} // end of class definition
