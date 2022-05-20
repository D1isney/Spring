package com.AOP.C;

import com.IOC.bean.Student;

public class Student_AOP {
    String name;
    int age;
    public Student_AOP(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Deprecated
    public void test(){
        System.out.println("我是过时方法");
    }

    public void say(String name){
        System.out.println("我叫"+name+",今年"+age+"岁了"+name);
    }
}
