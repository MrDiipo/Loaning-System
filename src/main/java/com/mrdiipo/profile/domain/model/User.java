package com.mrdiipo.profile.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private  String firstName;
    private  String lastName;
    private  int age;
    private  String occupation;

    public User(Long id, String firstName, String lastName, int age, String occupation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public User() {
    }
}
