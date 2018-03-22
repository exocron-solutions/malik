package de.exocronsolutions.malik.server;

import de.exocronsolutions.malik.core.MalikCore;
import de.exocronsolutions.malik.core.MalikCoreImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@SpringBootApplication
public class MalikServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(MalikServerBootstrap.class, args);
    }

    @Bean
    public MalikCore getMalikCore() {
        return new MalikCoreImpl();
    }
}
