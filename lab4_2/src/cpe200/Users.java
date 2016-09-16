package cpe200;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList = new ArrayList<User>();

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        userList.add(new User(userName,password));
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (User i:userList)
        {
            if (i.getUserName().equals(username))
            {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (User i : userList)
        {
            if (i.getUserName().equals(userName))
            {
                return i;
            }
        }
        return null;
    }

    public int count()
    {
        int c=0;
        for(User i:userList)
        {
            c++;
        }
        return c;
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]);

    }
}
