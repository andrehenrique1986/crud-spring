package com.andre.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.andre.crudspring.model.Course;
import com.andre.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

    /**
     * @param courseRepository
     * @return
     */
    @Bean	
    CommandLineRunner initDatabase(CourseRepository courseRepository){
      return args -> {
		courseRepository.findAll();

		Course c = new Course();
		c.setName("Angular com Spring");		
    c.setCategory("Front-End");

		courseRepository.save(c);
	  };
    }	
}
