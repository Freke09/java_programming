// 3.2 AccountTest.java
// creating and manipulating account object

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // creat a scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // creat an Account object and assign it to myAccount
        Account myAccount = new Account();

        // display initial value of name (null)
        System.out.println("Initial name is: " + myAccount.getName());

        // prompt for name input:
        System.out.println("Please enter the name: ");

        //accept and store the name
        String theName = input.nextLine(); // read a line of text

        myAccount.setName(theName); // put the name in myAccount
        System.out.println();

        // display the name stored in object myAccount
        System.out.println("Name in object myAccount is: " + myAccount.getName());

    }
}