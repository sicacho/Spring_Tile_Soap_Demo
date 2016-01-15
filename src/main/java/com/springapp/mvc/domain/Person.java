package com.springapp.mvc.domain;

import java.io.Serializable;

/**
 * Created by KhangTN1 on 1/14/2016.
 */
public class Person implements Serializable {
    Long id;
    String name;
    Integer age;
    String Slogan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSlogan() {
        return Slogan;
    }

    public void setSlogan(String slogan) {
        Slogan = slogan;
    }
}
