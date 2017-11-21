package com.tutorial.domain;

import lombok.Data;

/**
 * Created by jimmy on 2017/11/20.
 */
@Data
public class Book {

    private Long id;
    private String name;


    public String print(Long id,String name){
        System.out.println("调用print");
        return name;
    }

    public String printA(String name){
        System.out.println("调用A 。。。");
        return name;
    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }
}
