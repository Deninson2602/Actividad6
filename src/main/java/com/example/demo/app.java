package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import CourseRepo.CoursesRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = CoursesRepo.class)
public class app {

	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
