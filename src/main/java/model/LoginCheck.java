package model;
import sqldao.*;

import java.sql.SQLException;

public class LoginCheck {
    public boolean equalsElement(LoginEntity l) throws SQLException {
        Getdata GetLoginData =new Getdata();
        String name= GetLoginData.GetLoginData("select username from user","username",l.getName());
        String pwd= GetLoginData.GetLoginData("select password from user","password",l.getPwd());
        if(l!=null && l.getName().equals(name))
        {
            if(l.getPwd().equals(pwd))
            {
                return true;
            }
                return false;
        }
        return false;
    }
}
