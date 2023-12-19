package com.example.JDBCtoJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJDBCApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonRepo personRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// fire a query

		logger.info("All user -> {}",personRepo.findAll());
		logger.info("user id 1 -> {}",personRepo.findById(1));
		logger.info("user name -> {}",personRepo.findByName("nasrin"));
		logger.info("delete by id 3 -> {}",personRepo.deleteById(3));
		logger.info("insert id 6 -> {}",personRepo.insert(new Person(6,"samatha")));
		logger.info("update id 6 -> {}",personRepo.update(new Person(6,"winston")));
	}
}
