package model;
import com.google.gson.JsonObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servdddlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a="123";
        PrintWriter out=response.getWriter();
        System.out.println(111);
        JsonObject kk=new JsonObject();
        JsonObject tt=new JsonObject();
        tt.addProperty("wge","448");
        System.out.println(tt.toString());
        String ii=tt.toString();
        kk.addProperty("name",ii);
        System.out.println(kk);
        out.write(kk.toString());

    }
}
