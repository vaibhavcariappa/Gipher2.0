package com.stackroute.giphermanager.config;

import com.stackroute.rabbitmq.domain.GipherDTO;
import com.stackroute.rabbitmq.domain.UserDTO;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private RabbitTemplate rabbitTemplate;
    private DirectExchange exchange;

    @Autowired
    public Producer(RabbitTemplate rabbitTemplate, DirectExchange exchange) {
        this.rabbitTemplate = rabbitTemplate;
        this.exchange = exchange;
    }

    public void sendMessageToRabbitMq(UserDTO userDTO) {
        rabbitTemplate.convertAndSend(exchange.getName(), "user_routing", userDTO);
    }

    public void sendAddRecommendedGifToRabbitMq(GipherDTO gipherDTO) {
        rabbitTemplate.convertAndSend(exchange.getName(), "gif_add_routing", gipherDTO);
    }

    public void sendDelRecommendedGifToRabbitMq(GipherDTO gipherDTO) {
        rabbitTemplate.convertAndSend(exchange.getName(), "gif_del_routing", gipherDTO);
    }
}
