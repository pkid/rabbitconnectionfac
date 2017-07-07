package com.sap.ngp.sample.config;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("cloud")
@Configuration
public class RabbitMQCloudConfig extends AbstractCloudConfig {

    public RabbitConnectionFactory  rabbitFactory() {
        return connectionFactory().rabbitConnectionFactory();
    }
} 
