package UserAuthentication.Model;

import UserAuthentication.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
    //Attributes
    private List<User> users = new ArrayList<>();


    //METHODS
    
    /** register()
     * Registers a new user with a username, email, and password
     * @param username User's username
     * @param email User's email
     * @param password User's password
     * @return the newly created UserProfile if successful, otherwaise null
     */
    public User register(String username, String email, String password){
        return null;
    };

    /** login()
     * Logs in a user with a username and password
     * @param username User's username
     * @password password User's password
     * @return the UserProfile if login is successful, otherwise null
     */
    public User login (String username, String pasword){
        return null;
    };

    /** logout()
     * Logs out a user
     * @param user
     */
    public void logout(User user){
    };


}
