package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
}
