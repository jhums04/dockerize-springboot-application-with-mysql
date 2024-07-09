package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.repository;

import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long > {
}
