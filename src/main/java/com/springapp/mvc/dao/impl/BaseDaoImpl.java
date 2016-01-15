package com.springapp.mvc.dao.impl;


import com.springapp.mvc.dao.BaseDao;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by KhangTN1 on 1/15/2016.
 */
public class BaseDaoImpl<T,ID extends Serializable> implements BaseDao<T,ID> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> persistentClass ;

    public T find(ID id) {
        return entityManager.find(persistentClass, id);
    }

    public BaseDaoImpl() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public List< T > findAll(){
        return entityManager.createQuery( "from " + persistentClass.getName() ).getResultList();
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void persist(T entity) {
        entityManager.persist(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void merge(T entity) {
        entityManager.merge(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<T> createSample() {

        return null;
    }
}
