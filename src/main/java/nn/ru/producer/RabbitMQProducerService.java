package nn.ru.producer;

public interface RabbitMQProducerService {
    void sendMessage(String message, String routingKey);
}
