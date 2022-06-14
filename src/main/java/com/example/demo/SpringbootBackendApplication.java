package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRepository.save(new User("Arijit","Das","abc@gmail.com"));
		this.userRepository.save(new User("Pritam","Das","pqr@gmail.com"));
		this.userRepository.save(new User("Aniket","Shaw","stu@gmail.com"));
		this.userRepository.save(new User("Debajyoti","Bhattacharya","def@gmail.com"));
	}

}
