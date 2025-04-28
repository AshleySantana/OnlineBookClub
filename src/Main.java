import Homepage.Model.Book;
import Channels.Controller.ChannelController;
import Channels.Model.Channel;
import TestHarness.TestHarness;
import TrackProgress.Controller.LibraryController;
import TrackProgress.Model.ReadingProgress;
import TrackProgress.View.AddBookForm;
import TrackProgress.View.LibraryView;
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
        Channel channel = new Channel("Polstergeese");
        User user = new User("admin", "werna@com", "1234");
        ChannelController channelController = new ChannelController(channel, user);

        new TestHarness();

//        SwingUtilities.invokeLater(() -> {
//            User testUser = new User("admin", "jm", "1234");
//            UserProfileView profileView = new UserProfileView();
//            UserProfileController controller2 = new UserProfileController(testUser, profileView);
//
//            profileView.addChangeButtonListener(controller2.new ChangeButtonListener());
//
//        });


        ReadingProgress readingProgressModel = new ReadingProgress();
        LibraryView libraryView = new LibraryView();
        AddBookForm addBookForm = new AddBookForm();
        LibraryController libraryController = new LibraryController(readingProgressModel, libraryView, addBookForm);



    }
}
