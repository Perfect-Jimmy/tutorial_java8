package com.tutorial.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jimmy on 2017/11/21.
 * 反射获取方法信息:返回值+方法名+参数类型
 */
public class ReflectMethodTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        getSingleMethod();
        getAllMethod();
    }


    /**
     * 单独获取某一个方法
     * public Method getDeclaredMethod(String name, Class<?>... parameterTypes) // 得到该类所有的方法，不包括父类的
     * public Method getMethod(String name, Class<?>... parameterTypes) // 得到该类所有的public方法，包括父类的
     */
    public static void getSingleMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        /**
         * 1.获取类类型
         */
        Class aClass = Class.forName("com.tutorial.domain.Book");

        /**
         * 2.获取方法:参数分别是方法名和方法参数类的类类型列表
         */
        Method method = aClass.getDeclaredMethod("print", Long.class, String.class);

        /**
         * 3.调用方法:参数分别是对象和参数值
         */
        method.invoke(aClass.newInstance(),1L,"java");
    }


    /**
     * 获取所有方法
     */
    public static void getAllMethod() throws ClassNotFoundException {
        /**
         * 1. 获取类类型
         */
        Class aClass = Class.forName("com.tutorial.domain.Book");

        /**
         * 2. 获取所有方法
         */
        Method[] methods = aClass.getMethods();

        /**
         * 遍历
         */
        for(Method method:methods){
            String methodName = method.getName(); //获取方法名称
            System.out.println("methodName:"+methodName);
            Class returnType = method.getReturnType(); //获取方法返回值类类型
            System.out.println("returnType:"+returnType);
            String returnTypeName = returnType.getName(); //获取方法返回值类型名字
            System.out.println("returnTypeName:"+returnTypeName);
            Class[] paramTypes = method.getParameterTypes(); //获取所有参数的类类型数组
            for(Class class1 : paramTypes){ //遍历参数类的类类型数组，得到某个参数的类类型class1
                String paramName = class1.getName();// 得到该参数的类型名
                System.out.println("参数类类型:"+class1+",参数类类型名称:"+paramName);
            }
            System.out.println("-----------------------------------------------------");
        }
    }
    /**
     * methodName:equals
     returnType:boolean
     returnTypeName:boolean
     参数类类型:class java.lang.Object,参数类类型名称:java.lang.Object
     -----------------------------------------------------
     methodName:toString
     returnType:class java.lang.String
     returnTypeName:java.lang.String
     -----------------------------------------------------
     methodName:hashCode
     returnType:int
     returnTypeName:int
     -----------------------------------------------------
     methodName:getName
     returnType:class java.lang.String
     returnTypeName:java.lang.String
     -----------------------------------------------------
     methodName:getId
     returnType:class java.lang.Long
     returnTypeName:java.lang.Long
     -----------------------------------------------------
     methodName:setName
     returnType:void
     returnTypeName:void
     参数类类型:class java.lang.String,参数类类型名称:java.lang.String
     -----------------------------------------------------
     methodName:print
     returnType:class java.lang.String
     returnTypeName:java.lang.String
     参数类类型:class java.lang.Long,参数类类型名称:java.lang.Long
     参数类类型:class java.lang.String,参数类类型名称:java.lang.String
     -----------------------------------------------------
     methodName:printA
     returnType:class java.lang.String
     returnTypeName:java.lang.String
     参数类类型:class java.lang.String,参数类类型名称:java.lang.String
     -----------------------------------------------------
     methodName:setId
     returnType:void
     returnTypeName:void
     参数类类型:class java.lang.Long,参数类类型名称:java.lang.Long
     -----------------------------------------------------
     methodName:wait
     returnType:void
     returnTypeName:void
     参数类类型:long,参数类类型名称:long
     参数类类型:int,参数类类型名称:int
     -----------------------------------------------------
     methodName:wait
     returnType:void
     returnTypeName:void
     参数类类型:long,参数类类型名称:long
     -----------------------------------------------------
     methodName:wait
     returnType:void
     returnTypeName:void
     -----------------------------------------------------
     methodName:getClass
     returnType:class java.lang.Class
     returnTypeName:java.lang.Class
     -----------------------------------------------------
     methodName:notify
     returnType:void
     returnTypeName:void
     -----------------------------------------------------
     methodName:notifyAll
     returnType:void
     returnTypeName:void
     -----------------------------------------------------
     */
}
