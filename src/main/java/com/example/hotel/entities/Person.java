package com.example.hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "LAST_NAME", length = 20)
    private String lastName;
    @Column(name = "PASSPORT_CHARACTERS", length = 20)
    private String passportCharacters;
    @Column(name = "IMAGE", length = 20)
    private String passImage;

    @ManyToOne
    @JoinColumn(name = "roomTwoPersons_id")
    private RoomTwoPersons roomTwoPersons;

}