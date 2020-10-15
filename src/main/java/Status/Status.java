package Status;

import com.google.gson.JsonObject;

import java.io.PrintWriter;

public class Status {
    public static void LoginSuccessJson(PrintWriter out)
    {
        JsonObject LoginSuccessJson=new JsonObject();
        LoginSuccessJson.addProperty("code","200");
        LoginSuccessJson.addProperty("status","success");
        LoginSuccessJson.addProperty("ResonseMessage","登录成功！");
        out.write(String.valueOf(LoginSuccessJson));
    }
    public static void LoginFlaseJson(PrintWriter out)
    {
        JsonObject LoginFalseJson=new JsonObject();
        LoginFalseJson.addProperty("code","-1");
        LoginFalseJson.addProperty("status","false");
        LoginFalseJson.addProperty("ResponseMessage","账号或密码错误！");
        out.write(String.valueOf(LoginFalseJson));
    }
    public static void NoCompleteParameters(PrintWriter out)
    {
        JsonObject NoParametersJson=new JsonObject();
        NoParametersJson.addProperty("code","0");
        NoParametersJson.addProperty("status","false");
        NoParametersJson.addProperty("ResponseMessage","传参不完整或非法参数！");
        out.write(String.valueOf(NoParametersJson));
    }
}
