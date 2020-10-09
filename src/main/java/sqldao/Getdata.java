package sqldao;
import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getdata {
    static Statement stat=null;
    public Getdata() throws SQLException {
        this.stat=sqlconnection.getsqlconnection();
    }
    public String loginGet(String sql,String element,String rightElement)throws SQLException {
        ResultSet resu= stat.executeQuery(sql);
        while(resu.next())
        {
            if(rightElement.equals(resu.getString(element)))
            {
                return rightElement;
            }
        }
       return "null";
    }
}
