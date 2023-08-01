package com.quester.registryservice.repository;

import com.quester.registryservice.entity.SchoolGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolGroupRepository extends JpaRepository<SchoolGroup,Long> {
}
