/*
    Name: JR Iriarte
    Date: 10-5-19
    File: DiceRoller.java
    Description: This program accepts user input and initiates a dice game
 */

package dice;

import java.util.Scanner;
import java.util.Random;

public class DiceRoller
{
    public static void main(String[] args)
    {
        //display menu
        displayMenu();

        //modularize execution/user choices after taking input
        Scanner console = new Scanner(System.in);
        int choice = console.nextInt();

        //execute method calls once we have user input
        if(choice == 1)
        {
            executeOptionOne();
        }
        else if(choice == 2)
        {
            executeOptionTwo();
        }
        else if(choice == 3)
        {
            executeOptionThree();
        }
        else if(choice == 4)
        {
            executeByeMessage();
        } else
        {
            //everything other than 1-4
            System.out.println("Bad menu choice");
        }
    }

    public static void displayMenu()
    {
        //give choices to user
        System.out.println("Welcome to my dice game");
        System.out.println("-----------------------");
        System.out.println("1. Roll a die");
        System.out.println("2. Roll n dice");
        System.out.println("3. Play a dice game");
        System.out.println("4. Exit");
        System.out.println("Make a choice: ");
    }

    public static void executeOptionOne()
    {
        //declare and assign instances of Scanner/Random
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        //ask for number of sides and capture input
        System.out.println("Enter the number of sides");

        /*
        add 1 to user input to ensure a roll between 1 and user's choice
        since nextInt is between (0, [n-1]). Without adding 1, a user could
        pick a 5 sided die and only be able to roll up to 4.
         */
        int diSides = console.nextInt() + 1;

        // print a dice roll with an upper limit (now inclusive) of user's choice
        int randomRoll = random.nextInt(diSides);

        System.out.println("Rolling...");
        System.out.println("You roll a " + randomRoll);
    }

    public static void executeOptionTwo()
    {
        //ask about scoping inside main class (and then pass variable) to reduce redundancy
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        //ask for sides of die, and number of rolls
        System.out.println("Enter the number of sides on your die: ");
        int dieSides = console.nextInt();

        //validate proper amount of sides. Loop user until 4 or higher is chosen.
        while (dieSides < 4)
        {
            System.out.println("A die must have at least 4 sides. Please choose again.");
            dieSides = console.nextInt();
        }

        System.out.println("How many times do you want to roll the dice?");
        int rolls = console.nextInt();

        System.out.println("Rolling....");

        //start iterator at 1 or else printed rolls will be rolls +1 [or use i < rolls (exclusive)]
        for (int i = 1; i <= rolls; i++ )
        {
            /*
            Random(Enough) number generation :
            cast the inclusive range of dieSides to an int from a double using:
            (int)(Math.random() * dieSides) + 1
                                or
            provide min(1 since we dont want 0 as an option to roll),
            and max (dieSides + 1 to account for n-1) values for .ints method
            and chain method calls
             */
            int individualRandomRoll = random.ints(1,(dieSides + 1)).findFirst().getAsInt();
            System.out.println("A " + individualRandomRoll + " was rolled");
        }
    }

    public static void executeOptionThree()
    {
        //create vars and CONSTANTS
        final int SNAKE_EYES = 1;
        final int NUM_SIDES = 6;

        /*
        cast Math.random() * NUM_SIDES to int [since it's a double value]
        (Math.random() * NUM_SIDES) gives us a range of values [inclusive because
        our max-min is the same as NUM_SIDES since our min is 0] and we add 1 to
        shift the range up by 1.
        Note: This is less efficient than nextInt
         */

        int rollOne = (int)(Math.random() * NUM_SIDES) + 1;
        int rollTwo = (int)(Math.random() * NUM_SIDES) + 1;

        //print results
        System.out.println("\"Shake em up shake em up shake em up shake em\" - Ice Cube");
        System.out.println("You rolled a " + rollOne);
        System.out.println("You rolled a " + rollTwo);

        //outcome logic - ORDER IS IMPORTANT!!! What if both == 1? Satisfies two if conditions!
        if(rollOne == SNAKE_EYES && rollTwo == SNAKE_EYES)
        {

            //if rollOne and rollTwo both equal 1 (&& is more efficient than &)
            System.out.println("Didn\'t get to see the lights on the Good Year blimp. (Snake Eyes. You lose)");

        }
        else if(rollOne == rollTwo)
        {

            //if rollOne equals rollTwo
            System.out.println("Momma cooked a breakfast WITH hog. (Same. You lose.)");

        } else if (rollOne != rollTwo)
        {

            //if rollOne and rollTwo are not equal to one another
            System.out.println("Didn't even have to use my _K. Today was a good day. (you win.)");

        }
    }

    public static void executeByeMessage()
    {
        //display console goodbye banner
        System.out.println("-------------------");
        System.out.println("Thanks for playing!");
        System.out.println("-------------------");
    }
}
