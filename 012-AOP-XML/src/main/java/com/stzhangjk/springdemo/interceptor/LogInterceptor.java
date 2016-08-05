package com.stzhangjk.springdemo.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class LogInterceptor {

    //@Pointcut("execution(public * com.stzhangjk.springdemo..*(..))")
    private void myMethod(){

    }

    //@Before("myMethod()")
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    //@AfterReturning("myMethod()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //@AfterThrowing("myMethod()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //@Around("myMethod()")
    public Object around(ProceedingJoinPoint pj){


        try {
            System.out.println("around-before");
            Object o = pj.proceed();
            System.out.println("around-after");
            return o;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }

    }

}
