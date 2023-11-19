package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.emp.entity.EmpDetails;

@Repository
public interface EmpRepository extends JpaRepository<EmpDetails, Integer> {

}
