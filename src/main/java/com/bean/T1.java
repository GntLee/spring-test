package com.bean;

/**
 * @Author Lee
 * @Date 2018/6/29 16:18
 */
public class T1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "T1{" +
                "name='" + name + '\'' +
                '}';
    }
}
