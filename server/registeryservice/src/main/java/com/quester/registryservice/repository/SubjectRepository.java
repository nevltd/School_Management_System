package com.quester.registryservice.repository;


import com.quester.registryservice.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository  extends JpaRepository<Subject, Long> {
}
