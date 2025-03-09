package UserAuthentication.Model;

import Channels.Model.Channel;
import Homepage.Model.Library;
import Homepage.Model.ReadingGoal;
import SubManagement.Model.SubPlans;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class User {
    // Attributes
    private String username;
    private String email;
    private String password;
    private List<ReadingGoal> readingGoals;

    private ArrayList<Channel> subscribedChannels;
    private Library library;
    private boolean subscriptionStatus;
    public String paymentType;
    public int paymentInfo;
    private SubPlans currentSubscription; // This stores the user's current subscription plan
    private ImageIcon profile;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public SubPlans getCurrentSubscription() {
        return currentSubscription;
    }

    public void setCurrentSubscription(SubPlans currentSubscription) {
        this.currentSubscription = currentSubscription;
    }

    public ArrayList<Channel> getSubscribedChannels() {
        if (subscribedChannels == null) {
            subscribedChannels = new ArrayList<>(); // Ensure it is initialized before returning
        }
        return subscribedChannels;
    }

    public void setSubscribedChannels(ArrayList<Channel> subscribedChannels) {
        this.subscribedChannels = subscribedChannels;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public int getPaymentInfo() {
        return paymentInfo;
    }

    // Constructor for creating a user
    public User(String username, String email, String password, List<ReadingGoal> readingGoals, Library library, boolean subscriptionStatus, String paymentType, int paymentInfo, SubPlans currentSubscription, ImageIcon profile) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.readingGoals = readingGoals;
        this.library = library;
        this.subscriptionStatus = subscriptionStatus;
        this.paymentType = paymentType;
        this.paymentInfo = paymentInfo;
        this.currentSubscription = currentSubscription;
        this.profile = profile;
        this.subscribedChannels = new ArrayList<>();
    }

    // Constructor for creating a user with basic details
    public User(String username) {
        this.username = username;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.subscribedChannels = new ArrayList<>();
    }

    // Subscribe to a channel only if not already subscribed
    public void subscribeToChannel(Channel channel) {
        if (!getSubscribedChannels().contains(channel)) {
            subscribedChannels.add(channel);
            System.out.println(getUsername() + " Subscribed to: " + channel.getChannelName());
        } else {
            System.out.println("You're already subscribed to " + channel.getChannelName());
        }
    }

    // Unsubscribe from a channel only if the user is subscribed
    public void unsubscribeFromChannel(Channel channel) {
        if (getSubscribedChannels().remove(channel)) {
            System.out.println(getUsername() + " Successfully unsubscribed from: " + channel.getChannelName());
        } else {
            System.out.println("You are not subscribed to: " + channel.getChannelName());
        }
    }

    // Method to change the user's subscription plan
    public void changeSubscription(SubPlans newPlan) {
        // If the user is currently subscribed, store the previous plan
        if (currentSubscription != null) {
            System.out.println("Switching from " + currentSubscription.getSubDescription() + " to " + newPlan.getSubDescription());
        } else {
            System.out.println("No current subscription found. Subscribing to: " + newPlan.getSubDescription());
        }

        // Change to the new subscription
        this.currentSubscription = newPlan;
        System.out.println("Successfully switched to " + newPlan.getSubDescription() + " plan.");
    }
}
