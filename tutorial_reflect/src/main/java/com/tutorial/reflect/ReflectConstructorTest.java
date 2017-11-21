package com.tutorial.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by jimmy on 2017/11/21.
 */
public class ReflectConstructorTest {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        getSingleConstructor();
        getAllConstructor();
    }

    /**
     * 获取单个指定的构造函数
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     */
    public static void getSingleConstructor() throws ClassNotFoundException, NoSuchMethodException {
        /**
         * 1.获取类类型
         */
        Class aClass = Class.forName("com.tutorial.domain.Book");
        /**
         * 2.获取指定构造参数
         */
        Constructor constructor = aClass.getDeclaredConstructor(Long.class, String.class);

        System.out.println(constructor); //public com.tutorial.domain.Book(java.lang.Long,java.lang.String)
    }

    /**
     * 获取所有构造函数
     */
    public static void getAllConstructor() throws ClassNotFoundException {
        /**
         * 1.获取类类型
         */
        Class aClass = Class.forName("com.tutorial.domain.Book");
        /**
         * 2.获取所有构造函数
         */
        Constructor[] constructors = aClass.getDeclaredConstructors();
        /**
         * 3.遍历
         */
        for(Constructor constructor:constructors){
             Class[] paramTypes = constructor.getParameterTypes(); //获取构造函数参数类型的类类型数组
             for(Class class1 : paramTypes){ //遍历函数参数类型的类类型数组,得到某个参数的类类型class1
                 String paramName = class1.getName();//获取参数的类型名称
                 System.out.println("paramTypes:"+paramTypes+",paramName:"+paramName);
            }
        }
        /**
         * paramTypes:[Ljava.lang.Class;@74d9b7c1,paramName:java.lang.Long
         * paramTypes:[Ljava.lang.Class;@74d9b7c1,paramName:java.lang.String
         */
    }
}
