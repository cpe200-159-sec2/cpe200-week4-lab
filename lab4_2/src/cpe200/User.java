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
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(name.matches(regex)) {
            userName = name;
            return true;
        }
        else return false;
    }

    public boolean setPassword(String name) {
        String check = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if (name.matches(check)) {
            password = name;
            return true;
        }
        else return false;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
