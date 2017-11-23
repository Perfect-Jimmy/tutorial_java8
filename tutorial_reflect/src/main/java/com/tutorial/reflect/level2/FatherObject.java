package com.tutorial.reflect.level2;

import lombok.Data;

/**
 * Created by jimmy on 2017/11/21.
 */
@Data
public abstract class FatherObject implements Runnable{

    private Integer f_id;
    public String f_name;

    public void doSomething(){
        System.out.println("做事情......");
    }
}
