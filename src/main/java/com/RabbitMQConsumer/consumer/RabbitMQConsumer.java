package com.RabbitMQConsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

	@RabbitListener(queues = { "${rabbitmq.queue.name}" })
	public void consume(String message) {
		System.out.println("inside consume method : " + message);
	}

}
