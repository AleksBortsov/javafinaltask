package com.example.hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;
/*
like
 */
@Getter
@Setter
@Entity
@Table(name = "roomTwoPersons")
public class RoomTwoPersons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name="Simple room for 2 persons";

    @OneToMany(mappedBy = "roomTwoPersons", orphanRemoval = true)
    private Set<Person> personSet = new LinkedHashSet<>();
}
