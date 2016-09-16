package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {
        String setuser = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if(name.matches(setuser)){
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        String setpass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if(name.matches(setpass)){
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
