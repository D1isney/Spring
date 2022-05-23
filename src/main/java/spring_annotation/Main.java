package spring_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_annotation.bean.Card;
import spring_annotation.bean.annotation_student;
import spring_annotation.config.MainConfiguration;

//注解实现AOP
public class Main {
    public static void main(String[] args) {
        //xml实现
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        //注解实现
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        Card card = context.getBean(Card.class);
//        System.out.println(card);

        annotation_student annotation_student1 = context.getBean(spring_annotation.bean.annotation_student.class);
        System.out.println(annotation_student1.say("执行了方法"));
    }
}
