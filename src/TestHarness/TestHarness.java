package TestHarness;

import Channels.Model.Channel;
import Channels.Model.Comment;
import Homepage.Model.Book;
import UserAuthentication.Model.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TestHarness {
    public TestHarness(){
        System.out.println("Running Test Harness...:p");
        //Create Users
        User user1 = new User("JDog51");
        User user2 = new User("JillScott");
        User user3 = new User("SereinaW");

        log("Creating Books");
        Image defaultImage = new ImageIcon().getImage();

        Book book1 = new Book(defaultImage, "Queen of Abith", "Amna Cloud", false, 00);
        Book book2 = new Book(defaultImage, "Ray Franke", "Benny Bool", false, 00);
        Book book3 = new Book(defaultImage, "Half of a Yellow Sun", "Chimamanda Adichie", false, 00);

        log("Creating Book Channels:");
        Channel channel1 = new Channel("For the Yearners", book1, defaultImage);
        Channel channel2 = new Channel("Crime and Mystery", book2, defaultImage);
        Channel channel3 = new Channel("African Literature", book3, defaultImage);

        ArrayList<Channel> channels = new ArrayList<>();

        channels.add(channel1);
        channels.add(channel2);
        channels.add(channel3);

        // Printing the channels
        System.out.println("Subscribed Channels: " + channels);

        //Make Users subscribe to channels
        user1.subscribeToChannel(channel1);
        user1.subscribeToChannel(channel2);

        user2.subscribeToChannel(channel1);
        user2.subscribeToChannel(channel2);
        user2.subscribeToChannel(channel3);

        user3.subscribeToChannel(channel1);
        user3.subscribeToChannel(channel2);
        user3.subscribeToChannel(channel3);

        //creating comments in channel lol
        log("\n Comments in channel 1");
        channel1.addComment(new Comment(user1.getUsername(), "This book is very similar to Onward"));
        channel1.addComment(new Comment(user2.getUsername(), "How would this be similar to a pixar film?"));
        channel1.addComment(new Comment(user1.getUsername(), "I enjoy the use of Metaphors throughout the plot"));
        channel1.showAllCommentsInChannel();

        log("\n Comments in channel 2");
        channel2.addComment(new Comment(user3.getUsername(), "Ray is similar to Dahmer"));
        channel2.addComment(new Comment(user1.getUsername(), "Replying to comment above, Ray is like a very watered-down version"));
        channel2.addComment(new Comment(user2.getUsername(), "I love Ray's character development so much"));
        channel2.addComment(new Comment(user3.getUsername(), "You LIKE a MURDERER'S development?!"));
        channel2.showAllCommentsInChannel();
        user3.unsubscribeFromChannel(channel2);

        log("\n Comments in channel 3");
        channel3.addComment(new Comment(user1.getUsername(), "Chimamanda knows how to right a good conflicted love story"));
        channel3.addComment(new Comment(user2.getUsername(), "War is such an unnecessary thing, but the way we see the specks of it before it blows up"));
        channel3.addComment(new Comment(user3.getUsername(), "I need a movie adaptation ASAP"));
        channel3.addComment(new Comment(user1.getUsername(), "There's a movie on Prime! Me and my cousin just watched it"));
        channel3.showAllCommentsInChannel();
    }

private void log(String string){
    System.out.println(string);
}
}
