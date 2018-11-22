package com.smart.aspectj.basic;

import com.smart.Seller;
import com.smart.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeclaredParentsTest {
    @Test
    public void parent(){
        String configPath = "com/smart/aspectj/basic/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter)ctx.getBean("waiter");
        waiter.greetTo("John");
        waiter.serveTo("John");                     //添加serveTo()方法的测试
        waiter.greetTo("Tom");                                                   //未写完测试code   //现已写完
        Seller seller = (Seller)waiter;
        seller.sell("Beer","John");
    }
}
