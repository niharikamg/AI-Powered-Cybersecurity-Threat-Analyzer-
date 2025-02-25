package com.cybersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cybersecurity.model.ThreatLog;

public interface ThreatLogRepository extends JpaRepository<ThreatLog, Long> {
}