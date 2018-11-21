package com.smart.aspectj.fun;

import com.smart.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class PointcutFunTest {
    @Test
    public void pointcut(){
        String configPath = "com/smart/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("John");
        naughtyWaiter.greetTo("Tom");

    }
}
