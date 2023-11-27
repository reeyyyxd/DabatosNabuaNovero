package com.attendify.DabatosNabuaNovero.Repository;

import com.attendify.DabatosNabuaNovero.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
