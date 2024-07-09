package com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.controller;

import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.model.dto.PersonDTO;
import com.springboot_mysql_dockerize.dockerize_springboot_with_mysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/person", produces = {MediaType.APPLICATION_JSON_VALUE})
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/get-all")
    public List<PersonDTO> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("/get-person/{id}")
    public PersonDTO getPersonByID(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/create-person")
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }


}
