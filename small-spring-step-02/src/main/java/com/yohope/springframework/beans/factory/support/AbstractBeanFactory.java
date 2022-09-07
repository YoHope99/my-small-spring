package com.yohope.springframework.beans.factory.support;

import com.yohope.springframework.beans.BeansException;
import com.yohope.springframework.beans.factory.BeanFactory;
import com.yohope.springframework.beans.factory.config.BeanDefinition;

/**
 * @author dongyh
 * @date 2022/7/25
 * <p>
 * BeanDefinition 注册表接口
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
