package TrackProgress.Controller;

import Homepage.Model.Book;
import TrackProgress.Model.ReadingProgress;
import TrackProgress.View.AddBookForm;
import TrackProgress.View.LibraryView;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LibraryController {
    private ReadingProgress readingProgress;
    private LibraryView libraryView;
    private AddBookForm addBookForm;
    private JFrame addFrame;

    public LibraryController(ReadingProgress readingProgress, LibraryView libraryView, AddBookForm addBookForm) {
        this.readingProgress = readingProgress;
        this.libraryView = libraryView;
        this.addBookForm = addBookForm;

        libraryView.getAddABookButton().addActionListener(e -> openAddBookForm());

        JFrame frame = new JFrame("Reading Tracker");
        frame.setContentPane(libraryView.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        updateWantToReadDisplay();
        updateBookCount();
        updateBooksReadDisplay();
    }

    private void openAddBookForm() {
        if (addFrame == null) {
            addFrame = new JFrame("Add a Book");
            addFrame.setContentPane(addBookForm.getPanel());
            addFrame.pack();
        }

        addFrame.setVisible(true);

        for (ActionListener al : addBookForm.getAddButton().getActionListeners()) {
            addBookForm.getAddButton().removeActionListener(al);
        }

        addBookForm.getAddButton().addActionListener(e -> {
            try {
                String name = addBookForm.getNameTextField().getText();
                String author = addBookForm.getAuthorTextField().getText();
                int pages = Integer.parseInt(addBookForm.getNumPagesTextField().getText());

                Book newBook = new Book(name, author, pages);
                readingProgress.addBookToRead(newBook);

                updateWantToReadDisplay();
                updateBookCount();

                addBookForm.getNameTextField().setText("");
                addBookForm.getAuthorTextField().setText("");
                addBookForm.getNumPagesTextField().setText("");

                addFrame.setVisible(false);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for pages.");
            }
        });

        addBookForm.getBackButton().addActionListener(e -> addFrame.setVisible(false));
    }

    private void updateBookCount() {
        int count = readingProgress.getBooksToRead().size();
        libraryView.setNumOfBooks(count);
    }

    private void updateWantToReadDisplay() {
        StringBuilder sb = new StringBuilder();
        for (Book book : readingProgress.getBooksToRead()) {
            sb.append("Title: ").append(book.getTitle())
                    .append(", Author: ").append(book.getAuthor())
                    .append(", Pages: ").append(book.getNumPages()).append("\n");
        }
        libraryView.setWantToReadList(sb.toString());
    }

    public void markBookAsRead(Book book) {
        readingProgress.markBookAsRead(book);
        updateBooksReadDisplay();
        updateWantToReadDisplay();
        updateBookCount();
    }

    public void displayBooksRead() {
        System.out.println("Books already read:");
        for (Book book : readingProgress.getBooksRead()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }

    private void updateBooksReadDisplay() {
        StringBuilder sb = new StringBuilder();
        for (Book book : readingProgress.getBooksRead()) {
            sb.append("Title: ").append(book.getTitle())
                    .append(", Author: ").append(book.getAuthor())
                    .append(", Pages: ").append(book.getNumPages()).append("\n");
        }
        libraryView.setBookInfoList(sb.toString());
    }
}
