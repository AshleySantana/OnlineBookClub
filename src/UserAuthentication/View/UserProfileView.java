package UserAuthentication.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserProfileView {
    private JPanel pnlRoot;
    private JPanel userInfoPanel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JLabel subStatusLabel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextField textField2;
    private JLabel statusLabel;
    private JButton changeButton;

    private JPanel imgPanel;



    final int FRAME_WIDTH = 800;
    final int FRAME_HEIGHT = 700;

    public UserProfileView() {
        createComponents();
        JFrame frame = new JFrame("User Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setContentPane(pnlRoot);
        frame.setVisible(true);
    }

    public void createComponents() {
        pnlRoot = new JPanel(new BorderLayout());

        userInfoPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        emailLabel = new JLabel("Email:");
        subStatusLabel = new JLabel("Subscription:");

        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        textField2 = new JTextField();
        statusLabel = new JLabel("Free");

        changeButton = new JButton("Change");
        imgPanel = new JPanel(); // Optional if manually managing layout


        userInfoPanel.add(imgPanel);
        userInfoPanel.add(usernameLabel);
        userInfoPanel.add(textField1);
        userInfoPanel.add(passwordLabel);
        userInfoPanel.add(passwordField1);
        userInfoPanel.add(emailLabel);
        userInfoPanel.add(textField2);
        userInfoPanel.add(subStatusLabel);
        userInfoPanel.add(statusLabel);

        userInfoPanel.add(new JLabel()); // Empty placeholder
        userInfoPanel.add(changeButton);

        pnlRoot.add(userInfoPanel, BorderLayout.CENTER);
    }

    public void setStatus(String status) {
        statusLabel.setText("Status: " + status);
    }

    // You can leave this in case you want to add functionality later
    public JButton getChangeButton() {
        return changeButton;
    }

    public String getNewUsername() {
        return textField1.getText();
    }

    public String getNewPassword() {
        return new String(passwordField1.getPassword());
    }

    public String getNewEmail() {
        return textField2.getText();
    }

    public void addChangeButtonListener(ActionListener listener) {
        changeButton.addActionListener(listener);
    }
}
