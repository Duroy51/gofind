package com.enspy.repositories;

import com.enspy.model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface TrajetRepository extends CrudRepository<Trajet, Long> {
}
