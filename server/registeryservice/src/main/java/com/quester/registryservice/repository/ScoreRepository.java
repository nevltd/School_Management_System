package com.quester.registryservice.repository;

import com.quester.registryservice.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,Long> {
}
