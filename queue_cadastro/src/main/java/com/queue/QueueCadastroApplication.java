package com.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.queue.receiver.Receiver;


@SpringBootApplication
public class QueueCadastroApplication {
	
	static final String topicExchangeName = "spring-boot-exchange";
	
	static final String queueName = "queue-usuario";
	
	@Bean
	Queue queue() {
		return new Queue(queueName, false);
	}
	
	@Bean
	TopicExchange enchange() {
		return new TopicExchange(topicExchangeName);
	}
	
	@Bean
	SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
		
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(queueName);
		container.setMessageListener(listenerAdapter);
		
		return container;
		
	}
	
	@Bean
	MessageListenerAdapter listenerAdapter(Receiver receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}

	public static void main(String[] args) throws InterruptedException  {
		SpringApplication.run(QueueCadastroApplication.class, args).close();
	}

}
