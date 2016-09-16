package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }
    public User(String user,String pass){
        setUserName(user);
        setPassword(pass);
    }
    public boolean setUserName(String name)
    {
        if(name.matches("^([A-Za-z])([A-Za-z0-9]{7,})$")){
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name)
    {
        if(name.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$")){
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
