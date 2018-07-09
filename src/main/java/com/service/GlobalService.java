package com.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author Lee
 * @Date 2018/7/9 11:57
 *  singleton--默认
 *  prototype--每次返回新的实例
 *  request--每一个实例的作用域都为request范围
 *  session--每一个实例的作用域都为session范围
 */
@Service("globalService")
@Scope("prototype")
public class GlobalService {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
