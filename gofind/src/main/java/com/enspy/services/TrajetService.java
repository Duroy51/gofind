package com.enspy.services;

import com.enspy.model.Trajet;
import com.enspy.repositories.TrajetRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;



@ComponentScan(basePackages = {"com.enspy.repositories.trajetRepository"})
@Data
@Service
public class TrajetService {


    @Autowired
    private TrajetRepository trajetRepository;

    public Optional<Trajet> getTrajet(final Long id) {
        return trajetRepository.findById(id);
    }

    public Iterable<Trajet> getAllTrajets() {
        return trajetRepository.findAll();
    }

    public void deleteTrajet(final Long id) {
        trajetRepository.deleteById(id);
    }

    public Trajet saveTrajet(Trajet trajet) {
        return trajetRepository.save(trajet);
    }
}
