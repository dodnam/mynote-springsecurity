package com.nam.mynotespringsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * JPA auditor enable
 */
@Configuration
@EnableJpaAuditing // JpaAuditing을 Enable (JPA를 활성화 시킨다)
public class JpaAuditorConfig {
}
