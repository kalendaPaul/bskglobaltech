package com.kalenda.bskglobaltech.Repository;

import com.kalenda.bskglobaltech.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
