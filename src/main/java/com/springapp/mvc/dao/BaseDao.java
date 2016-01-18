package com.springapp.mvc.dao;

import com.springapp.mvc.domain.ModelBase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by KhangTN1 on 1/15/2016.
 */
public interface BaseDao<T extends ModelBase>  extends CrudRepository<T,Long>{


}
