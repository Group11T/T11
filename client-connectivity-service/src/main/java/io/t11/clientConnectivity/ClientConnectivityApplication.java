package io.t11.clientConnectivity;

import io.t11.clientConnectivity.model.Order;
import io.t11.clientConnectivity.service.OrderClient;
import io.t11.validatiingorders.wsdl.ValidateOrderResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientConnectivityApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(OrderClient quoteClient) {
		return args -> {
			Order order=new Order();
			order.setSide("buy");
			order.setPrice(12);
			order.setQuantity(1);
			order.setProduct("ss");

			ValidateOrderResponse response = quoteClient.validateNewOrder(order);
			System.err.println(response.getOrder().getPrice());
		};
	}

}
