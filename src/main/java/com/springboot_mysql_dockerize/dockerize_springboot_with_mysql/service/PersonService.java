package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.service;


import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.entity.PersonEntity;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.mapper.PersonMapper;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.model.data.PersonData;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.model.dto.PersonDTO;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository p) {
        this.personRepository = p;
    }

    public List<PersonDTO> getAllPerson() {
        List<PersonEntity> personEntityList = personRepository.findAll();

        List<PersonDTO> personDTOS = personEntityList.stream()
                .map(p -> PersonMapper.personEntityToData(p))
                .map(p -> PersonMapper.personDataToDTO(p))
                .toList();
        return personDTOS;
    }

    public PersonDTO getPersonById(Long id) {
        return personRepository.findById(id)
                .map(PersonMapper::personEntityToData)
                .map(PersonMapper::personDataToDTO)
                .orElse(null);
    }

    public PersonDTO createPerson(PersonDTO personDTO) {
        if (Objects.nonNull(personDTO.getFirstName()) && Objects.nonNull(personDTO.getLastName())) {
            PersonData personData = PersonMapper.personDtoToData(personDTO);
            PersonEntity personEntity = PersonMapper.personDataToEntity(personData);
            PersonEntity savedPersonEntity = personRepository.save(personEntity);
            return PersonMapper.personEntityToDTO(savedPersonEntity);
        }
        return new PersonDTO();
    }
}
