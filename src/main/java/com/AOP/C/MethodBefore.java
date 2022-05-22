package com.AOP.C;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

//通过接口的方式去实现AOP
public class MethodBefore implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法名称："+method.getName());
        System.out.println("方法参数："+ Arrays.toString(args));
        System.out.println("方法执行的对象为："+target);
    }
}


