package com.example.demo;

import com.example.demo.entities.MenuPizzeria;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

		//tramite i bean si recuperano la classe menu pizzeria e i bean con metodi all'interno. vieen stampato così il metodo
		MenuPizzeria menu = ctx.getBean(MenuPizzeria.class);
		menu.StampaMenu();
	}

}
