package OnlineBookClub.Channels.Model;

import javax.swing.*;
import java.nio.channels.Channel;
import java.util.List;

public class UserProfile {
    //Attributes
    private String username;
    private String email;
    private List<ReadingGoal> readingGoals;
    //private List<Channel> channels;
    private Library library;
    private boolean subscriptionStatus;
    private String paymentType;
    private int paymentInfo;
    private String userSubscription;
    private ImageIcon profile;
}
