package model;
import sqldao.*;

import java.sql.SQLException;

public class Logincheck {
    public boolean equalsElement(login l) throws SQLException {
        sqlconnection.getsqlconnection();
        String name;
        String pwd;
        name=Getdata.getElement("select Student_name from student","student_name",l.getName());
        pwd=Getdata.getElement("select Student_pwd from student","student_pwd",l.getPwd());
        if(l!=null && l.name.equals(name))
        {
            if(l.pwd.equals(pwd))
            {
                return true;
            }
                return false;
        }
        return false;
    }
}
