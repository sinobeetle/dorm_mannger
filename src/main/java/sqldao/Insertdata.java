package sqldao;

import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata {
    Statement stat=null;
    public Insertdata() throws SQLException {
        this.stat= sqlconnection.getsqlconnection();
    }
    public void RegisterInsertData(String sql) throws SQLException
    {
        stat.executeUpdate(sql);
    }

}
