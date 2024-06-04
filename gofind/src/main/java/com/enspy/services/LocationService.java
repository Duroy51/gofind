package com.enspy.services;

import com.enspy.model.Location;
import com.enspy.repositories.LocationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;





@ComponentScan(basePackages = {"com.enspy.repositories"})
@Data
@Service
public class LocationService {


    @Autowired
    private LocationRepository locationRepository;

    public Optional<Location> getLocation(final Long id) {
        return locationRepository.findById(id);
    }

    public Iterable<Location> getAllLocations() {

        return locationRepository.findAll();
    }

    public void deleteLocation(final Long id) {
        locationRepository.deleteById(id);
    }

    public Location saveLocation(Location location) {

        return locationRepository.save(location);
    }
}
