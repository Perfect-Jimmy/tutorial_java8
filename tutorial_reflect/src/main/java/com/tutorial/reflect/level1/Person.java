package com.tutorial.reflect.level1;

import lombok.Data;

/**
 * Created by jimmy on 2017/11/20.
 */
@Data
public class Person {
    private String eyes;
    private String head;

    public void printName(){
        System.out.println(this.getClass().getName());
    }
}
