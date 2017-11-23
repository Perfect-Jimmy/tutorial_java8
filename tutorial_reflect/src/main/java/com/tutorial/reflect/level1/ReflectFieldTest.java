package com.tutorial.reflect.level1;

import java.lang.reflect.Field;

/**
 * Created by jimmy on 2017/11/21.
 * 反射获取成员变量信息:成员变量类型+成员变量名
 */
public class ReflectFieldTest {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException {
        getSingleField();
        getAllField();
    }

    /**
     * 获取单个指定成员变量
     * public Field getDeclaredField(String name) // 获得该类自身声明的所有变量，不包括其父类的变量
     * public Field getField(String name) // 获得该类自所有的public成员变量，包括其父类变量
     */
    public static void getSingleField() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * 1.获取类类型
         */
        Class aclass = Class.forName("com.tutorial.domain.Book");

        /**
         * 2.获取成员变量
         */
        Field field = aclass.getDeclaredField("name");
        System.out.println(field);
    }

    /**
     * 获取所有成员变量
     * @throws ClassNotFoundException
     * @throws NoSuchFieldException
     */
    public static void getAllField() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * 1.获取类类型
         */
        Class aclass = Class.forName("com.tutorial.domain.Book");

        /**
         * 2.获取成员变量
         */
        Field[] fields = aclass.getDeclaredFields();
       /**
         * 遍历
         */
        for(Field field:fields){
            Class fieldType = field.getType();//获取成员变量类型的类类型
            String typeName = fieldType.getName();//获取成员变量类型名称
            String fieldName= field.getName();//获取成员变量名称
            System.out.println("fieldType:"+fieldType+",typeName:"+typeName+",fieldName:"+fieldName);
        }
        /**
         * fieldType:class java.lang.Long,typeName:java.lang.Long,fieldName:id
         * fieldType:class java.lang.String,typeName:java.lang.String,fieldName:name
         */
    }
}
