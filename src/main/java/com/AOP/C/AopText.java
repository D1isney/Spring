package com.AOP.C;

import lombok.extern.java.Log;

@Log
public class AopText {

    //执行之后
    public void after(){
        System.out.println("我是执行之后");
        log.info("我是执行之后的日志");
    }

    //执行之前的方法
    public void before(){
        System.out.println("我是执行之前");
        log.info("我是执行之前的日志");
    }
}
