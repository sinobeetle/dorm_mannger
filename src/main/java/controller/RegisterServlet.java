package controller;

import JsonDataProcess.JsonDataProcess;
import Status.Status;
import com.alibaba.fastjson.JSON;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegisterEntity RegisterData=null;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        BufferedReader ReadString=new BufferedReader(new InputStreamReader(request.getInputStream()));//建立流通道
        JsonDataProcess ProcessJson=new JsonDataProcess(ReadString);//实例化JsonDataProcess将数据流传入并处理
        if(ProcessJson.WhetherDataIsNull())
        {
            Status.NoCompleteParameters(out);
            ProcessJson.CloseStream();
            return;
        }
        else
        {
            System.out.println(ProcessJson.ReturnDataToController());
            RegisterData= JSON.parseObject(ProcessJson.ReturnDataToController(),RegisterEntity.class);//反序列化json为javabean对象
            ProcessJson.CloseStream();
        }

        try {
            RegisterModel.InsertRegisterData(RegisterData);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
