package sqldao;

import java.sql.*;

public class sqlconnection {

    public static void getsqlconnection() throws SQLException {
        Connection coon=null;
        Statement stat=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载sql驱动
            System.out.println("right");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error");
        }
        String name ="root";
        String pwd="wf981230";
        String url="localhost";

        try
        {
            coon= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC",name,pwd);
            System.out.println("right");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("error");
        }
        try
        {
            stat=coon.createStatement();
            System.out.println("right");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("error");
        }

//        String sql1="select * from student";
//        ResultSet rs=stat.executeQuery(sql1);
//        while(rs.next())
//        {
//            System.out.println(rs.getString("student_id"));
//        }
        Getdata gta=new Getdata(stat);
    }
//    public static void main(String[] args) throws SQLException {
//        getsqlconnection();
//    }
    public static void main(String[] args) throws SQLException
    {
    	getsqlconnection();
    }
}
