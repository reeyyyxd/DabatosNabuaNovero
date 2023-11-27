package com.attendify.DabatosNabuaNovero.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.attendify.DabatosNabuaNovero.Entity.StudentEntity;


@Repository
public interface StudentRepository extends JpaRepository <StudentEntity, Integer>{  
		
		
	}
