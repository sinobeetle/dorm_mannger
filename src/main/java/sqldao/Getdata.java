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
    public String GetLoginData(String sql,String LoginParameter,String realLoginParameter)throws SQLException {
        ResultSet resu= stat.executeQuery(sql);
        while(resu.next())
        {
            if(realLoginParameter.equals(resu.getString(LoginParameter)))
            {
                return realLoginParameter;
            }
        }
       return "null";
    }
}
