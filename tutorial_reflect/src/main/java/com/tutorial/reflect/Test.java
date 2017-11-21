package com.tutorial.reflect;

/**
 * Created by jimmy on 2017/11/20.
 */
public class Test {
    public static void main(String[] args) {
        //父类
        System.out.println(new Person().getClass().getName());//com.tutorial.reflect.Person
        new Person().printName();//com.tutorial.reflect.Person

        //父类实例
        Person person = new Person();
        person.printName(); //com.tutorial.reflect.Person

        //子类
        System.out.println(new Man().getClass().getName());//com.tutorial.reflect.Man
        new Man().printName();//com.tutorial.reflect.Man
    }
}
