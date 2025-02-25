package com.cybersecurity.controller;

import org.springframework.web.bind.annotation.*;
import com.cybersecurity.service.ThreatLogService;
import com.cybersecurity.model.ThreatLog;
import java.util.List;

@RestController
@RequestMapping("/api/threat-logs")
public class ThreatLogController {

    private final ThreatLogService threatLogService;

    public ThreatLogController(ThreatLogService threatLogService) {
        this.threatLogService = threatLogService;
    }

    @PostMapping
    public ThreatLog addThreatLog(@RequestBody ThreatLog threatLog) {
        return threatLogService.addThreatLog(threatLog);
    }

    @GetMapping
    public List<ThreatLog> getAllThreatLogs() {
        return threatLogService.getAllThreatLogs();
    }

    @GetMapping("/detect")
    public String detectThreats() {
        return threatLogService.detectThreats();
    }
}