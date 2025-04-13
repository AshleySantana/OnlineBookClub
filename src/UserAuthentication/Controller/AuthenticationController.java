package UserAuthentication.Controller;

import UserAuthentication.Model.User;
import UserAuthentication.Model.UserAuthentication;
import UserAuthentication.View.AuthenticationView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthenticationController {
    private UserAuthentication auth;
    private AuthenticationView view;
    private UserProfileController userProfileController;

    public AuthenticationController(UserAuthentication auth) {
        this.auth = auth;
        this.view = new AuthenticationView(this);


        this.view.addLoginButtonListener(new LoginButtonListener());
    }

    class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            String password = view.getPassword();
            User user = auth.login(username, password);
            if (user != null) {
                System.out.println("Login succesfull!");
                ShowUserProfile(user);
                view.showMessage("Login successful!");
            } else {
                view.showError("Invalid username or password.");
            }


        }
    }

    public void ShowUserProfile(User user){
        view.dispose();
        userProfileController = new UserProfileController(user);

    }
}