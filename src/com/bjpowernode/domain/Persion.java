package com.bjpowernode.domain;

import java.util.Date;

/**
 * @author zbh
 * @date 2020/7/20
 */
public class Persion {
    private String id;
    private int haha;
    private String name;
    private int age;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
