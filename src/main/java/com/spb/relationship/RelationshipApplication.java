package com.spb.relationship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.spb.relationship.data.entity")
public class RelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationshipApplication.class, args);
	}

}
