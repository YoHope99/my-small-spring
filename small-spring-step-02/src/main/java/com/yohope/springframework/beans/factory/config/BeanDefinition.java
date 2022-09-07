package com.yohope.springframework.beans.factory.config;

/**
 * @author dongyh
 * @date 2022/7/25
 */
@SuppressWarnings("{rawtypes}")
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
