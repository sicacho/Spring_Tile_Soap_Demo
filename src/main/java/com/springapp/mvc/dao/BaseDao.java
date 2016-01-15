package com.springapp.mvc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by KhangTN1 on 1/15/2016.
 */
public interface BaseDao<T,ID extends Serializable>  {
    public T find(ID id);
    public List<T> findAll();
    public void persist(T entity);
    public void merge(T entity);
    public void remove(T entity);
    public List<T> createSample();
}
