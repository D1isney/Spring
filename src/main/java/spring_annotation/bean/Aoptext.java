package spring_annotation.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aoptext {

    @Before("execution(* spring_annotation.bean.annotation_student.say(String))")
    public void before(){
        System.out.println("我是方法执行之前");
    }

    public void after(){
        System.out.println("我是方法执行之后");
    }

}
