package com.christian.environment.persistence.repository;

import com.christian.environment.persistence.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
