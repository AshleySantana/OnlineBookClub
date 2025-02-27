package TrackProgress.Model;

import Homepage.Model.Book;

import java.util.List;

public class ReadingProgress {

    //Attributes
    List<Book> booksRead;
    List<Book> booksToRead;

    //METHODS
    /** addBookToRead()
     * Adds a book to the list of books that the user intends to read.
     * @param book the book to be added to the "to-read" list
     */
    public void addBookToRead(Book book) {
        // Implementation for adding the book to the reading list
    }

    /** markBookAsRead(Book book)
     * Marks a book as read.
     * @param book the book that has been completed and should be marked as read
     */
    public void markBookAsRead(Book book) {
        // Implementation for marking the book as read
    }

    /** updateProgress(Book book, double progress)
     * Updates the progress of reading a book.
     * @param book the book whose reading progress is being updated
     * @param progress the current progress as a percentage (0.0 to 100.0)
     * @throws IllegalArgumentException if the progress is less than 0.0 or greater than 100.0
     */
    public void updateProgress(Book book, double progress) {
        if (progress < 0.0 || progress > 100.0) {
            throw new IllegalArgumentException("Progress must be between 0.0 and 100.0");
        }
        // Implementation for updating the book's progress
    }


}

