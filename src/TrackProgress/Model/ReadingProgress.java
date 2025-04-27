package TrackProgress.Model;

import Homepage.Model.Book;
import java.util.List;
import java.util.ArrayList;

public class ReadingProgress {
    private int totalPages;
    private int pagesRead;
    private List<Book> booksRead;
    private List<Book> booksToRead;

    public ReadingProgress(int totalPages) {
        this.totalPages = totalPages;
        this.pagesRead = 0;
        this.booksRead = new ArrayList<>();
        this.booksToRead = new ArrayList<>();
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    public List<Book> getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(List<Book> booksRead) {
        this.booksRead = booksRead;
    }

    public List<Book> getBooksToRead() {
        return booksToRead;
    }

    public void setBooksToRead(List<Book> booksToRead) {
        this.booksToRead = booksToRead;
    }

    public void updateProgress(int pages) {
        this.pagesRead += pages;
        System.out.println("Updated reading progress: " + pagesRead + " / " + totalPages);
    }

    public void addBookToRead(Book book) {
        booksToRead.add(book);
        System.out.println("Added book to reading list: " + book);
    }

    public void markBookAsRead(Book book) {
        if (booksToRead.remove(book)) {
            booksRead.add(book);
            System.out.println("Marked book as read: " + book);
        } else {
            System.out.println("Book not found in reading list.");
        }
    }

    public double getProgressPercentage() {
        return (double) pagesRead / totalPages * 100;
    }
}