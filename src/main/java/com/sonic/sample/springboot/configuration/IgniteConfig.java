package com.sonic.sample.springboot.configuration;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCheckedException;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * IgniteConfig
 *
 * @author Sonic
 * @since 2020/5/28
 */
@Configuration
@ImportResource(locations={"classpath:default-config.xml"})
public class IgniteConfig {

    @Bean
    public Ignite ignite(IgniteConfiguration igniteConfiguration) throws IgniteCheckedException {
        Ignite ignite = Ignition.start(igniteConfiguration);
        Ignition.setClientMode(true);
        return ignite;
    }
}
