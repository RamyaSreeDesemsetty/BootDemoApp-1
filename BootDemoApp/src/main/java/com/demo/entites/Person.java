package com.demo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pers")
public class Person {
    @Id
    private Integer personId;
    @Column(name="person_name")
    
    private String personName;
    @Column(name="person_city")
    private String personCity;

    public Person(Integer personId, String personName, String personCity) {

        this.personId = personId;
        this.personName = personName;
        this.personCity = personCity;
    }

    public Person() {
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }
}
