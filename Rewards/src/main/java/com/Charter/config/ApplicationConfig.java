package com.Charter.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.Charter.repository")
@EntityScan(basePackages = "com.Charter.entity")
public class ApplicationConfig {}