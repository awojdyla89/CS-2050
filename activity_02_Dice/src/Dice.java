/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - Dice
 */

import java.util.Random;

public class Dice {

    private int sides;
    private int value;

    public Dice() {
        sides = 6;
        value = 1;
    }

    public Dice(int sides) {
        if (sides < 2)
            this.sides = 2;
        else
            this.sides = sides;
        value = 1;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        Random r = new Random();
        value = r.nextInt(sides) + 1;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "sides=" + sides +
                ", value=" + value +
                '}';
    }
}
