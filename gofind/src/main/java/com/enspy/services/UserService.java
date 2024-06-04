package com.enspy.services;

import com.enspy.model.User;
import com.enspy.model.dao.CreateUserDao;
import com.enspy.repositories.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;



@ComponentScan(basePackages = {"com.enspy.repositories.UserRepository"})
@Data
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(final Long id) {
        return userRepository.findById(id);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final Long id) {
        userRepository.deleteById(id);
    }

    public User saveUser(User user) {


        return userRepository.save(user);
    }


}
