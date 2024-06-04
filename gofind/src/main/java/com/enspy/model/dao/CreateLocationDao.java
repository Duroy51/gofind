package com.enspy.model.dao;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateLocationDao {

    private String coordonnee;

    private String ville;

    private String quartier;

    private String Duree;

    private Long nombrePlace;

    private Long prixLocation;
}
