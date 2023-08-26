package com.marcosfabiano.desafio1jsp;

import com.marcosfabiano.desafio1jsp.entities.Order;
import com.marcosfabiano.desafio1jsp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio1jspApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1jspApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Integer code = sc.nextInt();
		Double basic = sc.nextDouble();
		Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println("Pedido código " + code);
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

		sc.close();
	}
}
