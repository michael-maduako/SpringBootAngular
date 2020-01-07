package com.michael.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.model.Emp;

@Repository
public interface EmpRepo extends CrudRepository<Emp,Integer>{

}
