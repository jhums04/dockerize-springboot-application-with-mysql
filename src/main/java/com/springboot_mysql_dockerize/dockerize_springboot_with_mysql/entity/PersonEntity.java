package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;
    private int age;

}
