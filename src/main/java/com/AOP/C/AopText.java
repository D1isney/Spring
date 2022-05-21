package com.AOP.C;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

@Log
public class AopText {

//    //执行之后
//    public void after(){
//        System.out.println("我是执行之后");
//        log.info("我是执行之后的日志");
//    }

    //执行之前的方法
    public void before(){
        System.out.println("我是执行之前");
        log.info("我是执行之前的日志");
    }

    public void after(JoinPoint point){
        //获得Student的对象
        System.out.println(point.getThis());
        //获得传进来的参数
        System.out.println(Arrays.toString(point.getArgs()));
        System.out.println("其实有参数point的日志");
        log.info("我是执行之后的日志");
    }

//    //环绕
//    public void around(){
//        System.out.println("我是环绕方法！");
//    }
    //相当于把原来的方法放过来这里代理
    //返回值的都在这里
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是前置");
        Object res = joinPoint.proceed();
        System.out.println("我是环绕方法！");
        return res;
    }
}
