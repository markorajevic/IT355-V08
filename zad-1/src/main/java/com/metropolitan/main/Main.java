/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.main;

import com.metropolitan.config.AppConfig;
import com.metropolitan.entitet.Person;
import com.metropolitan.service.PersonService;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Vlada
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = context.getBean(PersonService.class);

        // Add Persons
        personService.add(new Person("Petar", "Peric", "pera@example.com"));
        personService.add(new Person("Jovan", "Jovanovic", "jova@example.com"));
        personService.add(new Person("Milica", "Milic", "mica@example.com"));
        

        // Get Persons
        List<Person> persons = personService.listPersons();
        for (Person person : persons) {
            System.out.println("Id = " + person.getId());
            System.out.println("First Name = " + person.getFirstName());
            System.out.println("Last Name = " + person.getLastName());
            System.out.println("Email = " + person.getEmail());
            System.out.println();
        }

        context.close();
    }
}
