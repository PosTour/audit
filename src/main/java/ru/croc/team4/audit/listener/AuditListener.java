package ru.croc.team4.audit.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import ru.croc.team4.audit.domain.Audit;
import ru.croc.team4.audit.dto.AuditDto;
import ru.croc.team4.audit.mapper.AuditMapper;
import ru.croc.team4.audit.repository.AuditRepository;

@EnableKafka
@AllArgsConstructor
public class AuditListener {

    private final ObjectMapper objectMapper;
    private final AuditMapper auditMapper;
    private final AuditRepository  auditRepository;


    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void listen(String message) {
        AuditDto auditDto = objectMapper.convertValue(message, AuditDto.class);
        Audit audit = auditMapper.AdministrationDtotoAudit(auditDto);
        auditRepository.save(audit);
    }
}
