package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
        setUserName("");
        setPassword("");
    }

    public boolean setUserName(String name) {
        String regex = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if (name.matches(regex)){
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if (name.matches(regex)){
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
