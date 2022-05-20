package com.AOP;

import com.AOP.C.Student_AOP;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//AOP：面向切面编程
//AOP思想：在运行时动态地将代码切入到类的指定方法、指定位置上的编程思想就是面向切面编程
//实际上就是代理

public class V1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("beans_AOP.xml");
        Student_AOP student_aop = context1.getBean(Student_AOP.class);
        System.out.println();
        System.out.println(student_aop.getClass());
        student_aop.say("小明");
    }
}
