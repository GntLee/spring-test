package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author Lee
 * @Date 2018/6/29 16:19
 */
public class T2 {

    private String title;

    @Autowired
//    @Qualifier("t3")
    private T1 t1;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public T1 getT() {
        return t1;
    }

    public void setT(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public String toString() {
        return "T2{" +
                "title='" + title + '\'' +
                ", t1=" + t1 +
                '}';
    }
}
