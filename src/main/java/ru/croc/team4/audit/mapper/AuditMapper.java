package ru.croc.team4.audit.mapper;

import ru.croc.team4.audit.domain.Audit;
import ru.croc.team4.audit.dto.AuditDto;
import org.mapstruct.Mapper;

@Mapper
public interface AuditMapper {
    Audit AdministrationDtotoAudit(AuditDto auditDto);
}
