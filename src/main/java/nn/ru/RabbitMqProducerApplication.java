package nn.ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqProducerApplication {
    public static void main(String[] args) {
        System.out.println("... hello from Producer");
        SpringApplication.run(RabbitMqProducerApplication.class, args);
    }
}