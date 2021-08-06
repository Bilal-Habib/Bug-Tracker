package com.example.BugTracker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addNewStudent(User user) {
        Optional<User> userOptional = userRepository.findUserByName(user.getName());
        if (userOptional.isPresent()) {
            throw new IllegalStateException("Name not found");
        }
        userRepository.save(user);
    }
}
