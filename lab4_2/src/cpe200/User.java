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

    public boolean setUserName(String userName) {
        if (userName.matches("^[A-Za-z][A-Za-z0-9]{7,}$")){
            this.userName = userName;
            return true;
        }
        return false;
    }

    public boolean setPassword(String password) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}$")){
            this.password = password;
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
