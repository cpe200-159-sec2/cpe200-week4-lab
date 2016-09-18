package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
        this.userName = "";
        this.password = "";
    }

    public User(String name, String password){
        this.setUserName(name);
        this.setPassword(password);
    }

    public boolean setUserName(String name) {
        String check = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(check)){
            this.userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        if((name.length()>=12)&&(name.matches(".*[a-z]+.*"))&&(name.matches(".*[A-Z]+.*"))&&(name.matches(".*[0-9]+.*"))){
            this.password = name;
            return true;
        }
        return false;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
