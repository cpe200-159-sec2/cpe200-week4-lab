package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public boolean setUserName(String name) {
        if (name.length() < 8)
            return false;
        if (name.charAt(0) >= '0' && name.charAt(0) <= '9')
            return false;
        for (short i = 0; i < name.length(); i++)
        {
            char tmp = name.charAt(i);
            if (!((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z') || (tmp >= '0' && tmp <= '9')))
                return false;
        }
        userName = name;
        return true;
    }

    public boolean setPassword(String name) {
        boolean chk1,chk2,chk3;
        chk1 = chk2 = chk3 = false;
        if (name.length() < 12)
            return false;
        for (short i = 0; i < name.length(); i++)
        {
            char tmp = name.charAt(i);
            if (!((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z') || (tmp >= '0' && tmp <= '9')))
                return false;
            if (tmp >= 'A' && tmp <= 'Z')
                chk1 = true;
            else if (tmp >= 'a' && tmp <= 'z')
                chk2 = true;
            else if (tmp >= '0' && tmp <= '9')
                chk3 = true;
        }
        if (!(chk1 && chk2 && chk3))
            return false;
        password = name;
        return true;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
