/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 10 - PopulationsDriver class
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PopulationsDriver {

    private static final String FILE_NAME = "population.csv";
    private Hashtable<String, Integer> pops;

    public PopulationsDriver() throws FileNotFoundException {
        pops = new Hashtable<>();
        loadData();
    }

    // TODOd: finish the implementation of the method
    // this method should read all of the population data from "populations.csv into the
    // hashtable "pops"
    public void loadData() throws FileNotFoundException {
        // create a scanner to load info from input file
        // create a string variable to call the next portion of info
        //split the incoming information
        //load the hashtable with the information using put() method

        Scanner csvFile = new Scanner(new File(FILE_NAME));

        while (csvFile.hasNext()) {
            String nextLine = csvFile.next();
            String[] population = nextLine.split(",");
            pops.put(population[0], Integer.parseInt(population[1]));
        }
        csvFile.close();
    }


    // TODOd: return the state population by querying the hashtable "pops"
    public int getPopulation(String state) {
        return pops.get(state);
    }

    public static void main(String[] args) throws FileNotFoundException {
        PopulationsDriver pd = new PopulationsDriver();
        System.out.println("Population of CO = " + pd.getPopulation("CO"));
    }
}
