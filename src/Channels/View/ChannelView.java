package Channels.View;

import javax.swing.*;
import java.awt.*;

public class ChannelView extends JPanel {
    /**
     * Label to display the name of the channel.
     */
    private JLabel channelNameLabel;

    /**
     * Label to display the book cover image.
     */
    private JLabel bookImageLabel;

    /**
     * Text area to display user comments.
     */
    private JTextArea commentsArea;

    /**
     * Button to allow users to add a new comment.
     */
    private JButton addCommentButton;

    /**
     * Constructs a {@code ChannelView} object, initializing the UI components.
     */
    public ChannelView() {
        setLayout(new BorderLayout());

        channelNameLabel = new JLabel("Channel Name");
        bookImageLabel = new JLabel(new ImageIcon());
        commentsArea = new JTextArea(10, 30);
        addCommentButton = new JButton("Add Comment");

        JPanel topPanel = new JPanel();
        topPanel.add(channelNameLabel);
        topPanel.add(bookImageLabel);

        JScrollPane scrollPane = new JScrollPane(commentsArea);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(addCommentButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    /**
     * Updates the channel name displayed in the UI.
     *
     * @param name the new channel name to display
     */
    public void setChannelName(String name) {
        channelNameLabel.setText(name);
    }

    /**
     * Updates the book image displayed in the UI.
     *
     * @param imageIcon the new book image to display
     */
    public void setBookImage(ImageIcon imageIcon) {
        bookImageLabel.setIcon(imageIcon);
    }

    /**
     * Updates the comments displayed in the UI.
     *
     * @param comments the new comments to display
     */
    public void setComments(String comments) {
        commentsArea.setText(comments);
    }
}