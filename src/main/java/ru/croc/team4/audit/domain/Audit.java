package ru.croc.team4.audit.domain;

import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.dialect.PostgreSQLJsonPGObjectJsonbType;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Entity
public class Audit {
    @Id
    @UuidGenerator
    UUID id;
    @Column
    UUID changeId;
    @Column
    String operationType;
    @Column
    String entity;
    @Column
    Date changeTime;
    @Column
    String changes;

}
