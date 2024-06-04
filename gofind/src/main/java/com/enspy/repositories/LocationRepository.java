package com.enspy.repositories;

import com.enspy.model.Location;
import com.enspy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
