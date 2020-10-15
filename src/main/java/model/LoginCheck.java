package model;
import sqldao.*;

import java.sql.SQLException;

public class LoginCheck {
    public boolean equalsElement(LoginEntity l) throws SQLException
    {
        String username = null;
        String password=null;
        Getdata GetLoginData =new Getdata();
        username= GetLoginData.GetLoginData("select username from user","username",l.getName());
        password= GetLoginData.GetLoginData("select password from user","password",l.getPwd());

        if(l.getName().equals(username))
        {
            if(l.getPwd().equals(password))
            {
                return true;
            }
                return false;
        }
        return false;
    }
}
