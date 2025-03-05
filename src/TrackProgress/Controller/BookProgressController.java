package TrackProgress.Controller;

import TrackProgress.Model.ReadingProgress;

public class BookProgressController {
    //Attribute
    ReadingProgress readingProgress;

    //METHODS
    /** addBookToRead(name, author)
     * Adds a book to the list of books to read.
     * @param name   the name of the book
     * @param author the author of the book
     */
    public void addBookToRead(String name, String author) {
    }

    /** markBookAsRead(name)
     * Marks a book as read and moves it from the booksToRead list to the booksRead list.
     * @param name the name of the book to mark as read
     */
    public void markBookAsRead(String name) {
    }

    /** updateProgress(name, progress)
     * Updates the reading progress of a book.
     * @param name     the name of the book
     * @param progress the progress percentage of the book
     */
    public void updateProgress(String name, double progress) {
        System.out.println("Updating progress to " + progress + "%");
    }
}
