/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - Account
 */

public class Account {

    private int number;
    private String owner;
    private double balance;

    public Account(int number, String owner) {
        this.number = number;
        this.owner = owner;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;  // balance = balance + amount
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}