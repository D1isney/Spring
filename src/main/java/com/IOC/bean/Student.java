package com.IOC.bean;

import lombok.ToString;

@ToString
public class Student {
    String name;
    int age;
//    Card card;
//    List<String> list;
//    Map<String,Integer>map;

//    public void setName(String name ){
//        this.name = name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }

//    public void setCard(Card card) {
//        this.card = card;
//    }

//    public void setMap(Map<String, Integer> map) {
//        this.map = map;
//    }
//
//    public void setList(List<String> list) {
//        this.list = list;
//    }
//
//    public void init(){
//        System.out.println("我是初始化方法");
//    }
//
//    public Student_AOP(){
//        System.out.println("我是Student");
//    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name){
        this.name=name;
    }

//    public void destory(){
//        System.out.println("我是销毁方法");
//    }
}
