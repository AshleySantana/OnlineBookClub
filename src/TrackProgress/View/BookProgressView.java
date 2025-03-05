package TrackProgress.View;

import Homepage.Model.Book;

import java.util.List;

public class BookProgressView {

    /** displayBooksRead(books)
     * Displays the list of books that have been read.
     * @param books the list of books that have been completed
     */
    public void displayBooksRead(List<Book> books) {
    }

    /** displayBooksToRead(books)
     * Displays the list of books that are yet to be read.
     * @param books the list of books that are planned to be read
     */
    public void displayBooksToRead(List<Book> books) {
    }

    /** displayReadingProgress(book)
     * Displays the reading progress of a given book.
     * @param bookTitle the book whose reading progress is to be displayed
     */
    public void displayProgress(String bookTitle, Book progress) {
        System.out.println("Book: " + bookTitle + " - Progress: " + progress + "%");
    }

}
