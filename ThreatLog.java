package com.cybersecurity.model;

import jakarta.persistence.*;

@Entity
public class ThreatLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sourceIP;
    private String message;
    private int severity;

    // Getters and Setters
}