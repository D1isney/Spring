package com.Spring.bean;

import lombok.ToString;

import java.util.List;

@ToString
public class Student {
    String name;
    int age;
    Card card;
    List<String> list;

    public void setName(String name ){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCard(Card card) {
        this.card = card;
    }


    public void setList(List<String> list) {
        this.list = list;
    }

    public void init(){
        System.out.println("我是初始化方法");
    }

    public Student(){
        System.out.println("我是Student");
    }

    public void destory(){
        System.out.println("我是销毁方法");
    }
}
