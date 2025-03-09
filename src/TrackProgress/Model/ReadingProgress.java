package TrackProgress.Model;

import Homepage.Model.Book;
import java.util.List;
import java.util.ArrayList;

public class ReadingProgress {
    //Attributes
    private int totalPages;
    private int pagesRead;
    private List<Book> booksRead;
    private List<Book> booksToRead;

    //CONSTRUCTOR
    /**
     * Constructs a ReadingProgress object with the specified total pages.
     * Initializes pagesRead to 0 and creates empty lists for booksRead and booksToRead.
     * @param totalPages The total number of pages to be read.
     */
    public ReadingProgress(int totalPages) {
        this.totalPages = totalPages;
        this.pagesRead = 0;
        this.booksRead = new ArrayList<>();
        this.booksToRead = new ArrayList<>();
    }

    //METHODS
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the total number of pages for the reading progress.
     *
     * @param totalPages The total number of pages to set.
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Gets the number of pages that have been read so far.
     *
     * @return The number of pages read.
     */
    public int getPagesRead() {
        return pagesRead;
    }

    /**
     * Sets the number of pages that have been read.
     *
     * @param pagesRead The number of pages to set as read.
     */
    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    /**
     * Gets the list of books that have already been read.
     *
     * @return The list of books read.
     */
    public List<Book> getBooksRead() {
        return booksRead;
    }

    /**
     * Sets the list of books that have already been read.
     *
     * @param booksRead The list of books to set as read.
     */
    public void setBooksRead(List<Book> booksRead) {
        this.booksRead = booksRead;
    }

    /**
     * Gets the list of books that are yet to be read.
     *
     * @return The list of books to read.
     */
    public List<Book> getBooksToRead() {
        return booksToRead;
    }

    /**
     * Sets the list of books that are yet to be read.
     *
     * @param booksToRead The list of books to set as to-read.
     */
    public void setBooksToRead(List<Book> booksToRead) {
        this.booksToRead = booksToRead;
    }

    /** updateProgress()
     * Updates the reading progress by adding the specified number of pages to the pages read.
     *
     * @param pages The number of pages to add to the reading progress.
     */
    public void updateProgress(int pages) {
        this.pagesRead += pages;
        System.out.println("Updated reading progress: " + pagesRead + " / " + totalPages);
    }

    /** addBookToRead()
     * Adds a book to the list of books to be read.
     *
     * @param book The book to add to the reading list.
     */
    public void addBookToRead(Book book) {
        booksToRead.add(book);
        System.out.println("Added book to reading list: " + book);
    }

    /** markBookAsRead()
     * Marks a book as read by moving it from the "to-read" list to the "read" list.
     *
     * @param book The book to mark as read.
     */
    public void markBookAsRead(Book book) {
        if (booksToRead.remove(book)) {
            booksRead.add(book);
            System.out.println("Marked book as read: " + book);
        } else {
            System.out.println("Book not found in reading list.");
        }
    }
}

