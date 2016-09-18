package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public boolean setUserName(String name) {
        String valid = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        userName = name;
        if (name.matches(valid)) {
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        String valid = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{9,}$";
        if (name.matches(valid)) {
            password = name;
            return true;
        }
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
