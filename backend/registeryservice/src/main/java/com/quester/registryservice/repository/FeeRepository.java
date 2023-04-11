package com.quester.registryservice.repository;

import com.quester.registryservice.entity.Fee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeRepository extends JpaRepository<Fee, Long> {
}
