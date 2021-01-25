/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - DiceDriver
 */

public class DiceDriver {

    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice);
        for (int i = 0; i < 10; i++) {
            dice.roll();
            System.out.println(dice);
        }
    }
}
