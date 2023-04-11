package com.quester.registryservice.repository;

import com.quester.registryservice.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result,Long> {
}
