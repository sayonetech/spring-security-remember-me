package com.example.demorememberme;

import com.example.demorememberme.model.user.User;
import com.example.demorememberme.model.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoRememberMeApplication.class);
	}

	@Bean
	public CommandLineRunner init(UserRepository userRepository){
		return (args -> {
			User admin = new User("admin", "admin123");
			admin.setSuperuser(true);
			userRepository.save(admin);

			User guest = new User("test", "admin123");
			userRepository.save(guest);

		});

	}

}
