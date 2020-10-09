package model;
import sqldao.*;

import java.sql.SQLException;

public class Logincheck {
    public boolean equalsElement(login l) throws SQLException {
        Getdata gta=new Getdata();
        String name=gta.loginGet("select username from user","username",l.getName());
        String pwd=gta.loginGet("select password from user","password",l.getPwd());
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
