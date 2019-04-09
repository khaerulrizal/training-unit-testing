package com.btpn.jpahibernate.jpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.btpn.jpahibernate.jpahibernate.repository")
@SpringBootApplication
public class JpahibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpahibernateApplication.class, args);
	}

}
