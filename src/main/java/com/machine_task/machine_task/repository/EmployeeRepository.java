package com.machine_task.machine_task.repository;

import com.machine_task.machine_task.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
