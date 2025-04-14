package Channels.View;

import Channels.Model.Channel;
import Channels.Model.ChannelObserver;
import Channels.Model.Comment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChannelView extends JFrame implements ChannelObserver {
    private JPanel pnlRoot;
    private JPanel commentPnl;
    private JScrollPane scrollPane;
    private JTextArea inputArea;
    public JTextArea getInputArea(){
        return this.inputArea;
    }
    private JButton sendButton;
    public JButton getSendButton(){
        return this.sendButton;
    }
    private JPanel inputPanel;
    private String currentUser;
    private Channel channel;

    public ChannelView(Channel channel, String currentUser) {
        this.channel = channel;
        this.currentUser = currentUser;

        // Set up main panel
        //pnlRoot = new JPanel(new BorderLayout());

        // Comment panel in scroll
        //commentPnl = new JPanel();
        commentPnl.setLayout(new BoxLayout(commentPnl, BoxLayout.Y_AXIS));
        scrollPane.setViewportView(commentPnl); //= new JScrollPane(commentPnl);
        pnlRoot.add(scrollPane, BorderLayout.CENTER);

        // Input area
        inputArea = new JTextArea(3, 30);
        sendButton = new JButton("Send");
        //inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JScrollPane(inputArea), BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        pnlRoot.add(inputPanel, BorderLayout.SOUTH);

        // Button action
//        sendButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String text = inputArea.getText().trim();
//                if (!text.isEmpty()) {
//                    Comment comment = new Comment(currentUser,text);
//                    channel.addComment(comment);
//                    addCommentToView(comment);
//                    inputArea.setText("");
//                }
//            }
//        });
        channel.addObserver(this);

        // Load existing comments
        for (Comment c : channel.getChannelComments()) {
            addCommentToView(c);
        }
    }
    @Override
    public void onCommentAdded(Comment comment) {
        addCommentToView(comment);
    }


    public void addCommentToView(Comment comment) {
        String formattedComment = "<html><b>" + comment.getUserName() + ":</b><br>&nbsp;&nbsp;" + comment.getUserComment() + "</html>";
        JLabel label = new JLabel(formattedComment);
        label.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
        commentPnl.add(label);
        commentPnl.revalidate();
        commentPnl.repaint();

        JScrollBar vertical = scrollPane.getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }
    public void addSendButtonListener(ActionListener listener) {
        sendButton.addActionListener(listener);
    }

    public JPanel getPanel() {
        return pnlRoot;
    }
    public void createComponents(){
        this.setTitle("Book Club Channel");
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    // For testing standalone
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Book Club Channel");
            Channel channel = new Channel("Fantasy Fans");

            frame.setContentPane(new ChannelView(channel, "Aria").getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setVisible(true);
        });
    }
}
