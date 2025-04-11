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
        pnlRoot.setLayout(new GridBagLayout()); // Better for forms
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Initialize components (MUST DO THIS!)
        LoginTitleLabel = new JLabel("LOGIN", SwingConstants.CENTER);
        LoginTitleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        userNameLabel = new JLabel("Username:");
        userNameTextField = new JTextField(20);

        passwordLabel = new JLabel("Password:");
        passwordTextField = new JPasswordField(20);

        loginButton = new JButton("Login");
        forgetPasswordButton = new JButton("Forgot Password?");

        // Add components to panel with constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        pnlRoot.add(LoginTitleLabel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        pnlRoot.add(userNameLabel, gbc);

        gbc.gridx = 1;
        pnlRoot.add(userNameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        pnlRoot.add(passwordLabel, gbc);

        gbc.gridx = 1;
        pnlRoot.add(passwordTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        pnlRoot.add(loginButton, gbc);

        gbc.gridy++;
        pnlRoot.add(forgetPasswordButton, gbc);

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
