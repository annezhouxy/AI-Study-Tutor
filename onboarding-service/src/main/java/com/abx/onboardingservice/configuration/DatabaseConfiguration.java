package com.abx.onboardingservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.abx.model.repository")
@Configuration
public class DatabaseConfiguration {}
