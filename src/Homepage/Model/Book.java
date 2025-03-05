package Homepage.Model;

import java.awt.*;

public class Book {
    //Attributes
    Image bookImage;
    String title;
    String author;
    Boolean isRead;
    double bookProgress;


    //CONSTRUCTOR
    public Book(Image bookImage, String title, String author, Boolean isRead, double bookProgress) {
        this.bookImage = bookImage;
        this.title = title;
        this.author = author;
        this.isRead = isRead;
        this.bookProgress = bookProgress;
    }

    public Book (String title, String author, Boolean isRead, double bookProgress) {
        this.title = title;
        this.author = author;
        this.isRead = isRead;
        this.bookProgress = bookProgress;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    //METHODS
    public Image getBookImage() {
        return bookImage;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public Boolean getRead() {
        return isRead;
    }
    public double getBookProgress() {
        return bookProgress;
    }

    public void setBookImage(Image bookImage) {
        this.bookImage = bookImage;
    }
    public void setTitle(String name) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setRead(Boolean read) {
        isRead = read;
    }
    public void setBookProgress(double bookProgress) {
        this.bookProgress = bookProgress;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Read: " + isRead + ", Progress: " + bookProgress + "%");
    }
}
