package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Administrator
 * @create 2020/12/14 0014 21:38
 */
public class SpringIOC {
    public static ApplicationContext getCtx() {
        return new ClassPathXmlApplicationContext("applicationContexte.xml");

    }
}
