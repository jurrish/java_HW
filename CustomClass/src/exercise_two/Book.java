package exercise_two;

public class Book
{
    private String title;
    private String author;
    private int pages;
    private boolean hardcover;

    //parameratized constructor
    public Book(String title, String author, int pages, boolean hardcover)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.hardcover = hardcover;
    }

    //default
    public Book()
    {
        this.title = "some default title";
        this.author = "some default author";
        this.pages = 100;
        this.hardcover = false;
    }

    public String getTitle()
    {

        return title;
    }

    public String getAuthor()
    {

        return author;
    }

    public int getPages()
    {

        return pages;
    }

    public boolean isHardcover()
    {

        return hardcover;
    }

    public String toString()
    {
        //inherited by every instance of Book, and children of Book (unless overridden)
        return title + " by " + author + " (" + pages + " pages)";
    }
}
