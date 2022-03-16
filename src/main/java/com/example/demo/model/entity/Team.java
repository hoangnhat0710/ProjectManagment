package com.example.demo.model.entity;

import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teams")
@Data
public class Team {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToMany
    private List<User> users = new ArrayList<>();

    @ManyToMany(mappedBy = "teams")
    private List<Project> projects = new ArrayList<>();

}
