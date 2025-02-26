package OnlineBookClub.Channels.Model;

import javax.swing.*;
import java.nio.channels.Channel;
import java.util.List;

public class UserProfile {
    //Attributes
    private String username;
    private String email;
    private String password;
    private List<ReadingGoal> readingGoals;
    //private List<Channel> subscribedChannels;
    private Library library;
    private boolean subscriptionStatus;
    private String paymentType;
    private int paymentInfo;
    private String userSubscription;
    private ImageIcon profile;


    //METHODS
    /** getUsername()
     * Gets the username.
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

    /** getEmail()
     * Gets the email.
     * @return The email.
     */
    public String getEmail() {
        return email;
    }

    /** getPassword()
     * Gets the password.
     * @return The password.
     */
    public String getPassword() {
        return password;
    }
}
