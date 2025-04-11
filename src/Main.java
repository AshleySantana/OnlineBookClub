import TestHarness.TestHarness;
import UserAuthentication.Controller.AuthenticationController;
import UserAuthentication.Model.UserAuthentication;
import UserAuthentication.View.AuthenticationView;

public class Main {
    public static void main(String[] args) {

        UserAuthentication model = new UserAuthentication();
        AuthenticationView view = new AuthenticationView(null);
        AuthenticationController controller = new AuthenticationController(model, view);

        view.setAuthenticationController(controller);


        new TestHarness();

        // to test login, you can use the 2 username & password combinations below:

        // user: admin
        // pass: 1234

        // user: user
        // pass: pass
    }
}
