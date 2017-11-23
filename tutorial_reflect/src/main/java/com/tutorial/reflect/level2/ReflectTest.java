package com.tutorial.reflect.level2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by jimmy on 2017/11/21.
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        /**
         * 获取类类型
         */
        Class aClass = Class.forName("com.tutorial.reflect.level2.ExampleObject");
        //获取类的名字
        String fullClassName = aClass.getName();  //com.tutorial.reflect.level2.ExampleObject
        String simpleClassName = aClass.getSimpleName(); //ExampleObject
        System.out.println("fullClassName:"+fullClassName);
        System.out.println("simpleClassName:"+simpleClassName);
        //获取包信息
        Package apackage = aClass.getPackage(); //package com.tutorial.reflect.level2
        System.out.println("apackage:"+apackage);
        //获取父类
        Class superClass = aClass.getSuperclass();
        //判断父类是否是一个抽象类
        Boolean isAbstract = Modifier.isAbstract(superClass.getModifiers()); //true
        System.out.println("获取父类修饰符:"+superClass.getModifiers());
        System.out.println("获取父类修饰符:"+isAbstract);
        //获取父类的接口
        Class[] classes = superClass.getInterfaces();
        for(Class c:classes){
            System.out.println(c.getName()); //java.lang.Runnable
        }


        //获取所有public的属性(包括父类)
        Field[] publicFields = aClass.getFields();
        for(Field field:publicFields){
            System.out.println(field.getName());
        }
        System.out.println("------------------------");
        //获取本类所有属性
        Field[] fields = aClass.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
        System.out.println("------------------------");
        //获取本类所有方法
        Method[] methods = aClass.getDeclaredMethods();
        for(Method method:methods){
           // System.out.println(method.getName());
        }
        Method method = aClass.getDeclaredMethod("setScore",Integer.class);
        ExampleObject exampleObject = (ExampleObject)aClass.newInstance();
        method.invoke(exampleObject,18);
        System.out.println(exampleObject.getScore());
    }
}
