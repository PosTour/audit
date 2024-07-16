package ru.croc.team4.audit;

import org.springframework.boot.SpringApplication;

public class TestAuditApplication {

	public static void main(String[] args) {
		SpringApplication.from(AuditApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
