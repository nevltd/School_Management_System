package com.quester.registryservice.repository;

import com.quester.registryservice.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form,Long> {
}
