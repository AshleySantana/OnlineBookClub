package OnlineBookClub.Channels.Model;

import javax.swing.*;
import java.util.List;

public class User {
    //Attributes
    private String username;
    private String email;
    private List<ReadingGoal> readingGoals;
    //private List<Channel> subscribedChannels;
    private Library library;
    private boolean subscriptionStatus;
    private String paymentType;
    private int paymentInfo;
    private String userSubscription;
    private ImageIcon profile;
}
