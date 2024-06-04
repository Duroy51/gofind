package com.enspy.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Data
@Entity
@Table
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String coordonnee;

    @Column
    private String ville;

    @Column
    private String quartier;

    @Column
    private String duree;

    @Column
    private Long nombrePlace;

    @Column
    private Long prixLocation;

    @ManyToOne
    private User proprietaire_location;

    @ManyToOne
    private User locataire;

}
