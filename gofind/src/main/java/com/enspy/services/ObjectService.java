package com.enspy.services;

import com.enspy.repositories.ObjectRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import com.enspy.model.Object;



@Data
@Service
public class ObjectService {

    @Autowired
    private ObjectRepository objectRepository;

    public Optional<Object> getObject(final Long id) {
        return objectRepository.findById(id);
    }

    public Iterable<Object> getAllObjects() {
        return objectRepository.findAll();
    }

    public void deleteObject(final Long id) {
        objectRepository.deleteById(id);
    }

    public Object saveObject(Object object) {
        return objectRepository.save(object);
    }
}
