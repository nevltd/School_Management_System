package com.quester.registryservice.repository;


import com.quester.registryservice.entity.TheSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheSessionRepository extends JpaRepository<TheSession, Long> {
}
