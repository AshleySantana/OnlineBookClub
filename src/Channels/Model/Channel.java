package Channels.Model;

import Homepage.Model.Book;

import java.awt.*;
import java.util.ArrayList;

public class Channel {
    ArrayList<Comment> channelComments = new ArrayList<>();
    /**
     * The name of the channel.
     */
    private String channelName;

    /**
     * The image associated with the book for this channel.
     */
    private Image BookImage;

    Book book;
    /**
     * Gets the Book name.
     *
     * @return the name of the Book
     */
    public Book getBook() {
        return book;
    }
    /**
     * Sets the book name.
     * @param book book to set on the channel
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * Gets the channel name.
     *
     * @return the name of the channel
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the channel name.
     *
     * @param channelName the new name of the channel
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Gets the book image associated with the channel.
     *
     * @return the book image
     */
    public Image getBookImage() {
        return BookImage;
    }

    /**
     * Sets the book image associated with the channel.
     *
     * @param bookImage the book image to set
     */
    public void setBookImage(Image bookImage) {
        this.BookImage = bookImage;
    }

   public Channel(String channelName, Book book, Image bookImage){
        this.channelName = channelName;
        this.book = book;
        this.BookImage = bookImage;
   }
    /**
     * Constructs a {@code Channel} object with the specified channel name.
     *
     * @param channelName the name of the channel
     */
    public Channel(String channelName) {
        this.channelName = channelName;
    }
    /**
     * Constructs a {@code Channel} object with the specified channel name and book identifier.
     *
     * @param channelName the name of the channel
     * @param lop         an additional string parameter (unclear purpose, should be documented further)
     */
    public Channel(String channelName, String lop) {
        this.channelName = channelName;
    }

    public void addComment(Comment comment){
        channelComments.add(comment);
    }

    public void showAllCommentsInChannel(){
        for (Comment comment : channelComments) {
           comment.showComment();
        }
    }

}
