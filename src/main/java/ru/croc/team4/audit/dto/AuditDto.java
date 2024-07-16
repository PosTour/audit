package ru.croc.team4.audit.dto;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public record AuditDto(UUID changeId, String operationType, String entity, Date changeTime, String changes) {
}
