package com.attendify.DabatosNabuaNovero.Repository;

import com.attendify.DabatosNabuaNovero.Entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Integer> {
}
