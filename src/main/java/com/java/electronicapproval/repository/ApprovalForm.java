package com.java.electronicapproval.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApprovalForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @
    private String templateName;
}
