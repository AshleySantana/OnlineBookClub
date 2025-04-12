package UserAuthentication.Controller;

import UserAuthentication.Model.User;
import UserAuthentication.Model.UserAuthentication;
import UserAuthentication.View.AuthenticationView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthenticationController {
    private UserAuthentication auth;
    private AuthenticationView view;

    public AuthenticationController(UserAuthentication auth, AuthenticationView view) {
        this.auth = auth;
        this.view = view;

        this.view.addLoginButtonListener(new LoginButtonListener());
    }

    class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            String password = view.getPassword();

            //User user = auth.login(username, password);

            if (auth.login(username, password)) {
                System.out.println("Login succesfull!");

                view.showMessage("Login successful!");
            } else {
                view.showError("Invalid username or password.");
            }


        }
    }
}