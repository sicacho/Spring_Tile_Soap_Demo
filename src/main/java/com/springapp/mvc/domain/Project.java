package com.springapp.mvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by KhangTN1 on 1/14/2016.
 */
@Entity
public class Project extends ModelBase  {

    @Column
    String name;
    @Column
    Date date;
    @Column(length = 500)
    String Detail;
    @Column
    String customer;
    @Column
    String service;

    public Project(String name, Date date, String detail, String customer, String service) {
        this.name = name;
        this.date = date;
        Detail = detail;
        this.customer = customer;
        this.service = service;
    }

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
