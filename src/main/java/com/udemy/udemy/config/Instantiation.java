package com.udemy.udemy.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.udemy.udemy.domain.Post;
import com.udemy.udemy.domain.User;
import com.udemy.udemy.repository.PostRepository;
import com.udemy.udemy.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	

	@Autowired
	private PostRepository postReposiroty;
	
	@Autowired 
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postReposiroty.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");

		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", maria);

		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		postReposiroty.saveAll(Arrays.asList(post1, post2));
	}

}