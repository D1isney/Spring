package spring_annotation.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Aoptext {

//    @Before("execution(* spring_annotation.bean.annotation_student.say(String))")
//    public void before(JoinPoint point){
//        System.out.println(Arrays.toString(point.getArgs()));
//        System.out.println("我是方法执行之前");
//    }
//
//    @AfterReturning(value = "execution(* spring_annotation.bean.annotation_student.say(String))",returning = "val")
//    public void after(Object val){
//        System.out.println("我是方法执行之后:"+val);
//    }

    //环绕
    @Around("execution(* spring_annotation.bean.annotation_student.say(String))")
    //如果没有返回值void 会返回一个空null
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("方法执行之前的操作");
        Object val = point.proceed();
        System.out.println("方法执行之后的操作");
        return val;
    }

}
