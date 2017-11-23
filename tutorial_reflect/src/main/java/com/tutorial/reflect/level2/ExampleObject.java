package com.tutorial.reflect.level2;

import lombok.Data;

/**
 * Created by jimmy on 2017/11/21.
 */
@Data
public class ExampleObject extends FatherObject{
    public int age = 30;
    public String name = "jimmy";
    private Integer score = 60;
    protected String add = "cn";
    @Override
    public void doSomething() {
        super.doSomething();
    }

    public void run() {
        System.out.println("run......");
    }

    public void printName(){
        System.out.println(name);
    }
}
