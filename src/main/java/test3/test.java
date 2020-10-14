package test3;

import com.google.gson.*;


import java.lang.reflect.Type;
import java.util.ArrayList;

class A
{   String name="123";
    String age="52";
    public A()
    {
        System.out.println("5555");
    }
    public String a()
    {
        return "4545";
    }
}
public class test {
    public static void main(String[] args)
    {
        A c=new A();
        Gson gson=new GsonBuilder().create();
        String a=gson.toJson(new String("123"));
        String b=gson.toJson(c);
//        System.out.println(b);
//        String vv=gson.fromJson(a,String.class);
        A bb;
        bb = gson.fromJson(b,A.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(bb);
        System.out.println(bb instanceof A);
        JsonObject kk=new JsonObject();
        JsonObject tt=new JsonObject();
        tt.addProperty("wge","448");
        System.out.println(tt.toString());
        String ii=tt.toString();
        kk.addProperty("age",123);
        System.out.println(kk);
        ArrayList arr=new ArrayList();
        arr.add(456);
        arr.add(c);
        System.out.println(arr.toString());
        Gson gson1=new Gson();
        String info= gson1.toJson(arr);
        System.out.println(info);
        kk.add("kk",tt);
        System.out.println(kk);
//        System.out.println(vv);
    }
}
