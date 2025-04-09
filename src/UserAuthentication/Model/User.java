package UserAuthentication.Model;

import Channels.Model.Channel;
import Homepage.Model.Library;
import Homepage.Model.ReadingGoal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class User {
    //Attributes
    private String username;
    private String email;
    private String password;
    private List<ReadingGoal> readingGoals;


    public ArrayList<Channel> getSubscribedChannels() {
        if (subscribedChannels == null) {
            subscribedChannels = new ArrayList<>(); // Ensure it is initialized before returning
        }
        return subscribedChannels;
    }

    public void setSubscribedChannels(ArrayList<Channel> subscribedChannels) {
        this.subscribedChannels = subscribedChannels;
    }

    private ArrayList<Channel> subscribedChannels;
    private Library library;
    private boolean subscriptionStatus;
    public String paymentType;
    private int paymentInfo;
    public String userSubscription;
    private ImageIcon profilePicture;


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

    public User(String username, String email, String password, List<ReadingGoal> readingGoals, Library library, boolean subscriptionStatus, String paymentType, int paymentInfo, String userSubscription, ImageIcon profilePicture) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.readingGoals = readingGoals;
        this.library = library;
        this.subscriptionStatus = subscriptionStatus;
        this.userSubscription = userSubscription;
        this.profilePicture = profilePicture;
        this.subscribedChannels = new ArrayList<>();
    }

    public User(String username){
        this.username = username;
    }
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.subscribedChannels = new ArrayList<>();
    }

    // Subscribe to a channel only if not already subscribed
    public void subscribeToChannel(Channel channel) {
        if (!getSubscribedChannels().contains(channel)) {
            subscribedChannels.add(channel);
            System.out.println(getUsername() +" Subscribed to: " + channel.getChannelName());
        } else {
            System.out.println("You're already subscribed to " + channel.getChannelName());
        }
    }

    // Unsubscribe from a channel only if the user is subscribed
    public void unsubscribeFromChannel(Channel channel) {
        if (getSubscribedChannels().remove(channel)) {
            System.out.println(getUsername() +" Successfully unsubscribed from: " + channel.getChannelName());
        } else {
            System.out.println("You are not subscribed to: " + channel.getChannelName());
        }
    }

    // Change subscription status
    public void changeSubscriptionStatus(String newSubscriptionStatus) {
        this.userSubscription = newSubscriptionStatus;
        System.out.println(getUsername() + " changed subscription to: " + newSubscriptionStatus);
    }

    // Change payment info
    public void changePaymentInfo(String newPaymentType, int newPaymentInfo) {
        this.paymentType = newPaymentType;
        this.paymentInfo = newPaymentInfo;
        System.out.println(getUsername() + " updated payment details. Payment Type: " + newPaymentType + ", Payment Info: " + newPaymentInfo);
    }

}
