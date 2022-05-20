package com.IOC;

import com.IOC.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class V1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //类信息交给容器IOC去处理
        //通过反射机制创建
        Student student = context.getBean(Student.class);
        //返回的是Object型 需要强转
//        Student student1 = (Student) context.getBean("student");
        System.out.println(student);
//        System.out.println(student1);
        //单例 默认作用域是单例模式
        // 可以个beans.xml上面更改模式（原型模式）scope="prototype"
//        System.out.println(student == student1);
//        System.out.println(student.equals(student1));
        context.close();
//        depends-on="card"
        //表示card先初始化
    }
}
