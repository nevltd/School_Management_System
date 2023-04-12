package com.quester.registryservice.repository;

import com.quester.registryservice.entity.AggregateResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AggregateResultRepository extends JpaRepository<AggregateResult, Long> {
}
