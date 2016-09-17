package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;

    public Users() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user)
    {
        int i = 0;
        for (; i < userList.size(); i++) {
            if (userList.get(i).getUserName().compareTo(user.getUserName()) > -1) {
                break;
            }
        }
        userList.add(i, user);
    }

    public void addUser(String userName, String password)
    {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        addUser(user);
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String userName)
    {
        return null != getUserByUsername(userName);
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        int begin = 0, end = userList.size()-1;
        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            User user = userList.get(mid);
            switch (user.getUserName().compareTo(userName)) {
                case -1:
                    begin = mid + 1;
                    break;
                case 1:
                    end = mid - 1;
                    break;
                default:
                    return user;
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
        User[] userArray = {};
        userArray = userList.toArray(userArray);
        return userArray;
    }
}
