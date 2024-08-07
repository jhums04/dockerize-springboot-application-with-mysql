package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.mapper;

import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.entity.PersonEntity;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.model.data.PersonData;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.model.dto.PersonDTO;

import java.util.Objects;

public class PersonMapper {
    public static PersonData personDtoToData(PersonDTO personDTO) {
        PersonData p = new PersonData();

        if (Objects.nonNull(personDTO.getId()))
            p.setId(personDTO.getId());

        p.setFirstName(personDTO.getFirstName());
        p.setLastName(personDTO.getLastName());
        p.setAge(personDTO.getAge());
        return p;
    }

    public static PersonDTO personDataToDTO(PersonData personData) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAge(personData.getAge());
        personDTO.setFirstName(personData.getFirstName());
        personDTO.setLastName(personData.getLastName());
        personDTO.setId(personData.getId());
        return personDTO;
    }

    public static PersonData personEntityToData(PersonEntity person) {
        return new PersonData(person.getId(), person.getFirstName(), person.getLastName(), person.getAge());
    }

    public static PersonEntity personDataToEntity(PersonData personData) {
        return new PersonEntity(personData.getId(), personData.getFirstName(), personData.getLastName(), personData.getAge());
    }

    public static PersonDTO personEntityToDTO(PersonEntity savedPersonEntity) {
        return new PersonDTO(savedPersonEntity.getId(), savedPersonEntity.getFirstName(), savedPersonEntity.getLastName(), savedPersonEntity.getAge());
    }
}
