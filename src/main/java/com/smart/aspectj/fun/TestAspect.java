package com.smart.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
    @AfterReturning("@annotation(com.smart.anno.NeedTest)")
    public void needTestFun(){
        System.out.println("needTestFun() executed!");
    }
}
