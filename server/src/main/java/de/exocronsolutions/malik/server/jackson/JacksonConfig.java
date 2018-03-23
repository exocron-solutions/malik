package de.exocronsolutions.malik.server.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class JacksonConfig {

    private final ObjectMapper objectMapper;

    @Autowired
    public JacksonConfig(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void setup() {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
}