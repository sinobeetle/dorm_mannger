package model;

import sqldao.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterInsert {
    public static void insert(Register res) throws SQLException {
        Insertdata insert=new Insertdata();
        String name=res.getUsername();
        String id=res.getId();
        String password=res.getPassword();
        String number=res.getPhone_number();
        System.out.println(name+id+password+number);
        String sql="insert into stu values ('"+id+"','"+name+"','"+password+"','"+number+"')";
        insert.Register(sql);
    }
}
