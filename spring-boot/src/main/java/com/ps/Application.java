package com.ps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ps.repository.ApplicationRepository;

/**
 * The Class Application. git link:
 * https://gitlab.com/videolearning/spring-fundamentals/blob/master/Module6/src/main/java/com/pluralsight/web/TzaController.java
 */
@SpringBootApplication
public class Application {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * Demo.
	 *
	 * @param repository the repository
	 * @return the command line runner
	 */
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (agrs) -> {
			repository.save(
					new com.ps.entity.Application("Trackzilla", "kesha.williams", "Application for tracking bugs."));
			repository.save(
					new com.ps.entity.Application("Expenses", "mary.jones", "Application to track expense reports."));
			repository.save(new com.ps.entity.Application("Notifications", "Karen.kane",
					"Application to send alerts and notifications."));
			for (com.ps.entity.Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}
}
