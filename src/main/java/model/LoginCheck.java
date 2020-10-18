package model;
import sqldao.*;

import java.sql.SQLException;

public class LoginCheck {
    public boolean equalsElement(LoginEntity l) throws SQLException
    {
        String username = null;
        String password=null;
        Getdata GetLoginData =new Getdata();
        username= GetLoginData.GetLoginData("select username from user","username",l.getUsername());
        password= GetLoginData.GetLoginData("select password from user","password",l.getPassword());

        if(l.getUsername().equals(username))
        {
            if(l.getPassword().equals(password))
            {
                return true;
            }
                return false;
        }
        return false;
    }
}
