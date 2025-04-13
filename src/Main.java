import TestHarness.TestHarness;
import UserAuthentication.Controller.AuthenticationController;
import UserAuthentication.Controller.UserProfileController;
import UserAuthentication.Model.User;
import UserAuthentication.Model.UserAuthentication;
import UserAuthentication.View.AuthenticationView;
import UserAuthentication.View.UserProfileView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Authenticating User
        // to test login, you can use the 2 username & password combinations below:

        // user: admin
        // pass: 1234

        // user: user
        // pass: pass
        UserAuthentication model = new UserAuthentication();
        AuthenticationController controller = new AuthenticationController(model);


//        User model2 = new User();
//        UserProfileView view2 = new UserProfileView();
//        UserProfileController profileController = new UserProfileController(model2, view2);

        new TestHarness();

//        SwingUtilities.invokeLater(() -> {
//            User testUser = new User("admin", "jm", "1234");
//            UserProfileView profileView = new UserProfileView();
//            UserProfileController controller2 = new UserProfileController(testUser, profileView);
//
//            profileView.addChangeButtonListener(controller2.new ChangeButtonListener());
//
//        });




    }
}
