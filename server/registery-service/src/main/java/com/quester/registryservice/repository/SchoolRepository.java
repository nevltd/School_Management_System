package com.quester.registryservice.repository;

import com.quester.registryservice.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
