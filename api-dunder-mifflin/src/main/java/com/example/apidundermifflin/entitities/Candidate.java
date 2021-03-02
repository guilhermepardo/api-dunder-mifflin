package com.example.apidundermifflin.entitities;

import javax.persistence.*;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;

    private String experience;

    public Candidate(Long id, String name, int age, String experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getExperience() { return experience; }

    public void setExperience(String experience) { this.experience = experience; }

}
