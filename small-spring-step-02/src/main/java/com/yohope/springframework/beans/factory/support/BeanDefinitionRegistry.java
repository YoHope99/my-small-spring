package com.yohope.springframework.beans.factory.support;

import com.yohope.springframework.beans.factory.config.BeanDefinition;

/**
 * @author dongyh
 * @date 2022/7/25
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
