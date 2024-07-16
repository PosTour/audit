package ru.croc.team4.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.croc.team4.audit.domain.Audit;

import java.util.UUID;

public interface AuditRepository extends JpaRepository<Audit, UUID> {
}
