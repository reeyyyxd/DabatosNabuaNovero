package com.attendify.DabatosNabuaNovero.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attendify.DabatosNabuaNovero.Entity.AttendRecEntity;

public interface AttendRecRepository extends JpaRepository<AttendRecEntity, Integer>{

    List<AttendRecEntity> findByStudentId(Long studentId);


}
