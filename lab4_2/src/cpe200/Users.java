package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {

    public ArrayList<User> userList;

    public Users()
    {
        userList = new ArrayList<>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setPassword(password);
        userList.add(newUser);
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        if(userList.contains(user)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean usernameExists(String username)
    {
        for(User userTemp : userList){
            if(userTemp.userName.equals(username)){
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(User userTemp : userList){
            if(userTemp.userName.equals(userName)){
                return userTemp;
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        User[] userAr = new User[count()];
        userAr = userList.toArray(userAr);
        return userAr;
    }
}
