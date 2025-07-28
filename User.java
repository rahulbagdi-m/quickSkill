package com.sample.quickSkill.model;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private List<String> skills;

    // Constructors
    public User() {}
    public User(Long id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }
}

