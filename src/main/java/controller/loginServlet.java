package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import JsonDataProcess.*;
import Status.Status;
import com.alibaba.fastjson.JSON;
import model.LoginCheck;
import model.LoginEntity;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			LoginCheck ToCheckLoginData=null;
			LoginEntity LoginData=null;
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
				LoginData= JSON.parseObject(ProcessJson.ReturnDataToController(),LoginEntity.class);//反序列化json为javabean对象
				ProcessJson.CloseStream();
			}
			System.out.println(LoginData.getPassword());
			System.out.println(LoginData.getUsername());
		    if(LoginData.getPassword()==null||LoginData.getUsername()==null)
			{
				Status.NoCompleteParameters(out);
				return;                           //判断传参是否完整，若不完整，返回json
			}
		    else
			{
				ToCheckLoginData=new LoginCheck();		//传参正确，实例化LoginCheck对象
			}
			try
			{
				if(ToCheckLoginData.equalsElement(LoginData))
				{
					Status.LoginSuccessJson(out);	//验证成功
				}
				else
				{
					Status.LoginFlaseJson(out);		//验证失败
				}
			}
			catch (SQLException throwables)
			{
				throwables.printStackTrace();
			}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
