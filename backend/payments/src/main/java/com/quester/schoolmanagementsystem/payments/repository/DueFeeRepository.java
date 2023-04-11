package com.quester.schoolmanagementsystem.payments.repository;

import com.quester.schoolmanagementsystem.payments.entity.DueFee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DueFeeRepository extends JpaRepository<DueFee, Long> {
}
