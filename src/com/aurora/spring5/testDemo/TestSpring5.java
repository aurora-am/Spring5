package com.aurora.spring5.testDemo;

import com.aurora.spring5.Orders;
import com.aurora.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd() {
        //1、加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("盘符的路径进去");
        //2、获取配置创建的对象
        User user = context.getBean(User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testOrders() {
        //1、加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean2.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("盘符的路径进去");
        //2、获取配置创建的对象
        Orders orders = context.getBean("orders",Orders.class);

        System.out.println(orders);
        orders.ordersTest();

    }
}
