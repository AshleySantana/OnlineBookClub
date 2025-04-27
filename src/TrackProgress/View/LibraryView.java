package TrackProgress.View;

import javax.swing.*;
import java.awt.*;

public class LibraryView {
    private JPanel libraryPnlRoot;
    private JTextField numofBookTextField;
    private JTextArea bookInfoListTextArea;
    private JButton addABookButton;
    private JLabel numBooksLabel;
    private JLabel libraryLabel;
    private JTextArea wantToReadTextArea;
    private JLabel readingWishListLabel;
    private JLabel libraryTitleLabel;

    public JPanel getPanel() {
        return libraryPnlRoot;
    }

    public JButton getAddABookButton() {
        return addABookButton;
    }

    public JTextArea getWantToReadTextArea() {
        return wantToReadTextArea;
    }

    public JTextField getNumOfBookTextField() {
        return numofBookTextField;
    }

    public JTextArea getBookInfoListTextArea() {
        return bookInfoListTextArea;
    }

    public void setNumOfBooks(int count) {
        numofBookTextField.setText(String.valueOf(count));
    }

    public void setWantToReadList(String text) {
        wantToReadTextArea.setText(text);
    }

    public void setBookInfoList(String text) {
        bookInfoListTextArea.setText(text);
    }

    private void createUIComponents() {
        libraryPnlRoot = new JPanel();
        libraryPnlRoot.setLayout(new BorderLayout());

        // Top Section
        JPanel topPanel = new JPanel(new FlowLayout());
        addABookButton = new JButton("Add a Book?");
        numofBookTextField = new JTextField(5);
        topPanel.add(addABookButton);
        topPanel.add(new JLabel("Books to Read:"));
        topPanel.add(numofBookTextField);

        // Center Section
        wantToReadTextArea = new JTextArea(10, 25);
        bookInfoListTextArea = new JTextArea(10, 25);

        // Add scroll panes for better UX
        JScrollPane wantScroll = new JScrollPane(wantToReadTextArea);
        JScrollPane readScroll = new JScrollPane(bookInfoListTextArea);

        JPanel centerPanel = new JPanel(new GridLayout(1, 2));
        centerPanel.add(wantScroll);
        centerPanel.add(readScroll);

        // Final layout
        libraryPnlRoot.add(topPanel, BorderLayout.NORTH);
        libraryPnlRoot.add(centerPanel, BorderLayout.CENTER);
    }
}