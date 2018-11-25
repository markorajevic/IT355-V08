/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.service;
import com.metropolitan.dao.PersonDao;
import com.metropolitan.entitet.Person;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Vlada
 */
@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonDao userDao;

    @Transactional
    @Override
    public void add(Person person) {
        userDao.add(person);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Person> listPersons() {
        return userDao.listPersons();
    }

}
