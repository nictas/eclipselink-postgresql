package com.nictas.eclipselink.postgresql.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Human {

    @Id
    @SequenceGenerator(name = "human_id_sequence", sequenceName = "human_id_sequence")
    @GeneratedValue(generator = "human_id_sequence", strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    public Human() {
        // Required by JPA.
    }

    public Human(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
