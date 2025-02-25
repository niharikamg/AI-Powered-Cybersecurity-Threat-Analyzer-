package com.cybersecurity.service;

import org.springframework.stereotype.Service;
import com.cybersecurity.model.ThreatLog;
import com.cybersecurity.repository.ThreatLogRepository;
import java.util.List;

@Service
public class ThreatLogService {

    private final ThreatLogRepository threatLogRepository;

    public ThreatLogService(ThreatLogRepository threatLogRepository) {
        this.threatLogRepository = threatLogRepository;
    }

    public ThreatLog addThreatLog(ThreatLog threatLog) {
        return threatLogRepository.save(threatLog);
    }

    public List<ThreatLog> getAllThreatLogs() {
        return threatLogRepository.findAll();
    }

    public String detectThreats() {
        // Dummy AI logic for threat detection
        long threatCount = threatLogRepository.findAll().stream().filter(log -> log.getSeverity() > 7).count();
        return threatCount > 0 ? "Potential Threats Detected!" : "No threats detected.";
    }
}