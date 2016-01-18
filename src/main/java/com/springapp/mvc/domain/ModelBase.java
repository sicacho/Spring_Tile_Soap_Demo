package com.springapp.mvc.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by KhangTN1 on 1/18/2016.
 */
@MappedSuperclass
public class ModelBase implements Serializable {

    @Id
    @GeneratedValue
    @Column
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
