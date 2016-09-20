package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User(){

    }

    public User(String userName, String password) {
        setPassword(password);
        setUserName(userName);

    }



    public boolean setUserName(String name) {

        if (name.matches("^([A-Z|a-z])([A-Z|a-z|0-9]+)$")&&name.length()>=8){
            userName = name;
            return true ;
        }
        else return false;
    }

    public boolean setPassword(String name) {
        if (name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([A-Z|a-z|0-9])+$")&&name.length()>=8){
            password = name;
            return  true;
        }
        else return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
