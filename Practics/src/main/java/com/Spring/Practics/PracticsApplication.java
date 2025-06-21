package com.Spring.Practics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticsApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(PracticsApplication.class, args);
		System.out.println("hello spring");
		Dbservice db=context.getBean(Dbservice.class);

		System.out.println(db.getData());

		DbController controller=context.getBean(DbController.class);



	}

}
