package com.ms;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
import java.util.Random;

@SpringBootApplication
public class ProdutoServiceApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ProdutoServiceApplication.class);
        Properties properties = new Properties();
        int serverPort = new Random().nextInt(8050, 8070);

        String nickname = MobyNamesGenerator.getRandomName();
        properties.put("spring.application.serverNick", nickname);
        properties.put("server.port", serverPort);
        application.setDefaultProperties(properties);
        application.run(args);
    }

}
//./mvn install -Dnative