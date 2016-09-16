package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User(){

    }
    public User(String userName,String password) {
        setUserName(userName);
        setPassword(password);
    }

    public boolean setUserName(String name) {
        String check="^([A-Za-z])([A-Za-z0-9]{7,})$";

        if(name.matches(check)) {
            userName=name;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setPassword(String pass) {
        String check="^(?=.*[0-9])(?=.*[A-Za-z])(?=.*[A-Z])(?=.*[a-z])([A-Za-z0-9]{12,})$";

        if(pass.matches(check)) {
            password=pass;
            return true;
        }
        else {
            return false;
        }
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
