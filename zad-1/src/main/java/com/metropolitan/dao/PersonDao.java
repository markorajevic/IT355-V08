/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.dao;

import com.metropolitan.entitet.Person;
import java.util.List;

/**
 *
 * @author Vlada
 */
public interface PersonDao {

    void add(Person person);

    List<Person> listPersons();
}
