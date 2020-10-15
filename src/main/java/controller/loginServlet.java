package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Status.Status;
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
			LoginCheck logck=null;
		 	LoginEntity login=new LoginEntity();//建立实体模型对象
		    login.setName(request.getParameter("username"));
		    login.setPwd(request.getParameter("password"));
			System.out.println(login.getName());
			System.out.println(login.getPwd());
		    if(login.getPwd()==null||login.getName()==null||login.getPwd()==""||login.getName()=="")
			{
				Status.NoCompleteParameters(out);
				return;                           //判断传参是否完整，若不完整，返回json
			}
		    else
			{
				 logck=new LoginCheck();		//传参正确，进入实例化LoginCheck对象
			}
			try
			{
				if(logck.equalsElement(login))
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
