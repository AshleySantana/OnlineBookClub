package Homepage.Model;

import java.awt.*;

public class Book {
    //Attributes
    Image bookImage;
    String name;
    String author;
    Boolean isRead;
    double bookProgress;


    //CONSTRUCTOR
    public Book(Image bookImage, String name, String author, Boolean isRead, double bookProgress) {
        this.bookImage = bookImage;
        this.name = name;
        this.author = author;
        this.isRead = isRead;
        this.bookProgress = bookProgress;
    }


    //METHODS
    public Image getBookImage() {
        return bookImage;
    }
    public String getName() {
        return name;
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
    public void setName(String name) {
        this.name = name;
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

}
