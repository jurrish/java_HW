/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: ExerciseTwoDriver.java
    Description: Driver for problem 2
 */

package exercise_two;

public class ExerciseTwoDriver
{
    public static void main(String[] args)
    {
        //create instance
        Book hungerGames = new Book("The Hunger Games", "Suzanne Collins", 411, true);
        System.out.println(hungerGames.toString()); //The Hunger Games by Suzanne Collins (411 pages)

        //create and store book objs
        Book[] books = new Book[3];
        books[0] = new Book("Where the Red Fern Grows", "Wilson Rawls", 304, false);
        books[1] = new Book("The Fellowship of the Ring", "JRR Tolkien", 550, true);
        books[2] = new Book("The Hunt for Red October", "Tom Clancy", 300, false);

        //pass book of month and book array
        Library library = new Library(hungerGames, books);
        System.out.println(library.toString()); //Book of the month - "The Hunger Games", # of books - 3
    }
}
