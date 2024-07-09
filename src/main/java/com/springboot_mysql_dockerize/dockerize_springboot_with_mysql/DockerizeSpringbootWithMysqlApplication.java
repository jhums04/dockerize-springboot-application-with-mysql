package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerizeSpringbootWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizeSpringbootWithMysqlApplication.class, args);
	}

}
