package test;

import com.google.gson.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clz=Class.forName("test2.test");
        System.out.println(clz);
        Constructor constructor=clz.getConstructor(String.class);
        Object obj=constructor.newInstance("456");
    }
}
