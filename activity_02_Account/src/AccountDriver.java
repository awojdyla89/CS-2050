/*
 * CS2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - AccountDriver
 */

public class AccountDriver {

    public static void main(String[] args) {

        Account acct = new Account(12345, "Thyago");
        System.out.println(acct);
        System.out.println("Depositing $" + 200);
        acct.deposit(200);
        System.out.println(acct);
        System.out.println("Trying to withdraw $" + 50);
        if (acct.withdraw(50))
            System.out.println("Success!");
        else
            System.out.println("Failed!");
        System.out.println(acct);
        System.out.println("Trying to withdraw $" + 170);
        if (acct.withdraw(170))
            System.out.println("Success!");
        else
            System.out.println("Failed!");
        System.out.println(acct);

        System.out.println();
    }
}
