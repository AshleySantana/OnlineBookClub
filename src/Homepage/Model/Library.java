package Homepage.Model;

import Homepage.Model.Book;

import java.util.List;

public class Library {
    //Attributes
    List<Book> booksRead;
    List<Book> booksToRead;


    //CONSTRUCTOR
    public Library(List<Book> booksRead, List<Book> booksToRead) {
        this.booksRead = booksRead;
        this.booksToRead = booksToRead;
    }


    //METHODS

    public List<Book> getBooksRead() {
        return booksRead;
    }
    public List<Book> getBooksToRead() {
        return booksToRead;
    }

    public void setBooksRead(List<Book> booksRead) {
        this.booksRead = booksRead;
    }
    public void setBooksToRead(List<Book> booksToRead) {
        this.booksToRead = booksToRead;
    }
}
