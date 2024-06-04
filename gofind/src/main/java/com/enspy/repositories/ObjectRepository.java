package com.enspy.repositories;

import com.enspy.model.User;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.enspy.model.Object;
import java.util.UUID;



@Repository
public interface ObjectRepository extends CrudRepository<Object, Long> {

}
