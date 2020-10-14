package sqldao;

import java.sql.*;

public class sqlconnection {

    public static Statement getsqlconnection() throws SQLException {
        Connection coon = null;
        Statement stat = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载sql驱动
            System.out.println("right");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
        String name = "dorm";
        String pwd = "wf981230";

        try {
            coon = DriverManager.getConnection("jdbc:mysql://118.31.244.94:3306/dorm?serverTimezone=UTC", name, pwd);
            System.out.println("right");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("error");
        }
        try {
            stat = coon.createStatement();
            System.out.println("right");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return stat;
    }

}