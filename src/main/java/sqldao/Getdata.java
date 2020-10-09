package sqldao;
import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getdata {
    static Statement stat=null;
    public Getdata(Statement stat)
    {
        this.stat=stat;
    }
    public static String getElement(String sql,String element,String rightElement) throws SQLException {
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
