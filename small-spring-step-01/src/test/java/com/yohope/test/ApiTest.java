package com.yohope.test;

import com.yohope.springframework.BeanDefinition;
import com.yohope.springframework.BeanFactory;
import com.yohope.test.bean.UserService;
import org.junit.Test;

/**
 * @author dongyh
 * @date 2022/7/23
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
