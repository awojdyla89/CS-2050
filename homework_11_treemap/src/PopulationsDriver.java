/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 11 - PopulationsDriver class
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.*;

public class PopulationsDriver {

    private static final String FILE_NAME = "population.csv";
    private TreeMap<String, Integer> pops;

    public PopulationsDriver() throws FileNotFoundException {
        pops = new TreeMap<>();
        loadData();
    }

    // TODOd: finish the implementation of the method
    // this method should read all of the population data from "populations.csv into the
    // hashtable "pops"
    public void loadData() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new FileInputStream(FILE_NAME));

        while (inputFile.hasNext()) {
            String[] segment = inputFile.next().split(",");
            pops.put(segment[0], Integer.parseInt(segment[1]));
        }
    }

    // TODOd: return the state population by querying the hashtable "pops"
    public int getPopulation(String state) {
        return pops.get(state);
    }

    // TODOd: build a string with all of the state populations (one state per line)
    public String toString() {

        // TODOd: first use keySet to get a Set reference of the keys
        Set<String> keys = pops.keySet();

        // TODOd: then get an iterator from the set of keys
        Iterator<String> iterator = keys.iterator();

        // TODOd: iterate over the keys and build a string with the (state, population) pairs
        String str = "";
        while (iterator.hasNext()) {
            String temp = iterator.next();
            str += temp + "," + pops.get(temp) + "\n";
        }
        // return the generated string
        return str;
    }

    public static void main(String[] args) throws FileNotFoundException {
        PopulationsDriver pd = new PopulationsDriver();
        System.out.println("Population of CO = " + pd.getPopulation("CO"));
        System.out.println(pd);
    }
}
