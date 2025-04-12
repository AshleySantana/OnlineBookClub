package UserAuthentication.Model;

import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
    private List<User> users = new ArrayList<>();

    public UserAuthentication() {
        // FAKE USERS
        users.add(new User("admin", "admin@example.com", "1234"));
        users.add(new User("user", "user@example.com", "pass"));

    }

    public Boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }



    public User register(String username, String email, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null;
            }
        }
        User newUser = new User(username, email, password);
        users.add(newUser);
        return newUser;
    }

    public void logout(User user) {
        // Placeholder logic
    }


}
