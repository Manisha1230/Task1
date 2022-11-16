package com.Findfile.Project.New.Exercise.Project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Findfile.Project.New.Exercise.Project.Entity.CustomerEntity;
@Repository
public interface CustomerDTO extends CrudRepository<CustomerEntity,Integer>{

}
