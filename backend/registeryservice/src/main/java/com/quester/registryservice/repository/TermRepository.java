package com.quester.registryservice.repository;


import com.quester.registryservice.entity.Term;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermRepository  extends JpaRepository<Term, Long> {
}
