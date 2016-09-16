package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {

    private String userName;
    private String password;

    public User() {

    }
   public User (String name ,String password){
        this.userName = name;
        this.password =password;

}
    public boolean setUserName(String name) {

        if ((name.length() >= 8) &&(name.matches("^([A-Za-z])([A-Za-z0-9]+)$"))){
            userName =name;
            return true;
        }
        else return false;
    }

    public boolean setPassword(String name) {
        if((name.length() >=12)&&(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]+)$"))){
            password =name;
            return true;
        }
        else    return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
