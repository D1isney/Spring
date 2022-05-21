package com.IOC;

import com.IOC.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class V2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Student student2 = context2.getBean(Student.class);
//        context2.getBean("student");
        System.out.println(student2);
    }
}
