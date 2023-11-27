package com.attendify.DabatosNabuaNovero.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.attendify.DabatosNabuaNovero.Entity.*;



public interface UserRepository extends JpaRepository <UserEntity, Integer> {
}
