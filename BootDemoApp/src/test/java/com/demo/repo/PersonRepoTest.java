package com.demo.repo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.demo.entites.Person;

@SpringBootTest

class PersonRepoTest {


    @Autowired
    private PersonRepo personRepo;

    @Test
    @Rollback(false)
    void isPersonExitsById() {
		Person person = new Person(5, "Ramya", "chennai");
        personRepo.save(person);
		Boolean actualResult = personRepo.isPersonExitsById(5);
       assertThat(actualResult).isTrue();
    }

    /*@AfterEach
    void tearDown() {
        System.out.println("tearing down");
        personRepo.deleteAll();
    }*/

    @BeforeEach
    void setUp() {
        System.out.println("setting up");
    }
}