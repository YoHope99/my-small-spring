package com.yohope.springframework.beans.factory.config;

/**
 * @author dongyh
 * @date 2022/7/25
 *
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
