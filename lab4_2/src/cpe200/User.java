package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String username,String password){
        setUserName(username);
        setPassword(password);
    }



    public boolean setUserName(String name) {
        if(name.length()>=8&&name.matches("^[A-Za-z][A-Za-z0-9]+$")){
            this.userName = name;
            return true;
        }else {
            return false;
        }
    }

    public boolean setPassword(String name) {
        if(name.length()>=12&&name.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[A-Za-z0-9]+")){
            this.password = name;
            return true;
        }else {
            return false;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
