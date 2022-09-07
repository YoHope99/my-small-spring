package com.yohope.springframework.beans.factory;

import com.yohope.springframework.beans.BeansException;

/**
 * @author dongyh
 * @date 2022/7/25
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
