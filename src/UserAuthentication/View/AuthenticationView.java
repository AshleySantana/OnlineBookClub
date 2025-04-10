package UserAuthentication.View;

import UserAuthentication.Controller.AuthenticationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AuthenticationView extends JFrame {
    private JLabel LoginTitleLabel;
    private JLabel userNameLabel;
    private JTextField userNameTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordTextField;
    private JButton forgetPasswordButton;
    private JButton loginButton;
    private JPanel pnlRoot;

    final int FRAME_WIDTH = 600;
    final int FRAME_HEIGHT = 700;

    private AuthenticationController authenticationController;

    public AuthenticationView(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
        createComponents();
    }

    public void createComponents() {
        pnlRoot = new JPanel();
        userNameTextField = new JTextField(20);
        passwordTextField = new JPasswordField(20);


        // Add components
        pnlRoot.add(LoginTitleLabel);
        pnlRoot.add(userNameLabel);
        pnlRoot.add(userNameTextField);
        pnlRoot.add(passwordLabel);
        pnlRoot.add(passwordTextField);
        pnlRoot.add(loginButton);
        pnlRoot.add(forgetPasswordButton);

        this.add(pnlRoot);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("User Authentication");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void addLoginButtonListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }

    public String getUsername() {
        return userNameTextField.getText();
    }

    public String getPassword() {
        return new String(passwordTextField.getPassword());
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // For setting controller
    public void setAuthenticationController(AuthenticationController controller) {
        this.authenticationController = controller;
    }
}
