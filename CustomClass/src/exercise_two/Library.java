package exercise_two;

public class Library
{
    private Book[] allBooks;
    private static Book bookOfTheMonth;

//    private static getBooks

    public Library(Book bookOfTheMonth, Book[] allBooks)
    {
        this.bookOfTheMonth = bookOfTheMonth;
        this.allBooks = allBooks;
    }

    public String toString()
    {
        return "Book of the month - " + bookOfTheMonth + ", # of books - " + allBooks.length;
    }
}
