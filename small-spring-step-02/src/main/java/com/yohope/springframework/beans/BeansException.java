package com.yohope.springframework.beans;

/**
 * @author dongyh
 * @date 2022/7/25
 *
 * 定义 Bean 异常
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
