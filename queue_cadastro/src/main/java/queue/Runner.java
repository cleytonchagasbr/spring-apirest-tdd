package queue;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {

	private final RabbitTemplate rabbitTemplate;
	private final Receiver receiver;
	
	public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
		this.receiver = receiver;
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enviando mensagem...");
		rabbitTemplate.convertAndSend(MessagingApplication.topicExchangeName, "foo.bar.baz", "Deu certo");
		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
	}
}
