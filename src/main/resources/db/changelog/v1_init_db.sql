-- liquibase formatted sql

-- changeset Admin:1720602481939-1
CREATE TABLE audit
(
    id             UUID NOT NULL,
    change_id      UUID,
    operation_type VARCHAR(255),
    entity         VARCHAR(255),
    change_time    TIMESTAMP WITHOUT TIME ZONE,
    changes        VARCHAR(255),
    CONSTRAINT pk_audit PRIMARY KEY (id)
);

