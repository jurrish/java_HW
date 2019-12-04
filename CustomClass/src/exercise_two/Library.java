/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: Library.java
    Description: Library class that will contain Books - problem 2
 */

package exercise_two;

public class Library
{
    private Book[] allBooks;
    private static Book bookOfTheMonth; //shared state accessible by Class

    public Library(Book bookOfTheMonth, Book[] allBooks)
    {
        this.bookOfTheMonth = bookOfTheMonth;
        this.allBooks = allBooks;
    }

    public String toString()
    {
        return "Book of the month - " + bookOfTheMonth.getTitle() + ", # of books - " + allBooks.length;
    }
}
