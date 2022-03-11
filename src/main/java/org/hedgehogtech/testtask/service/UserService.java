package org.hedgehogtech.testtask.service;

import lombok.AllArgsConstructor;
import org.hedgehogtech.testtask.entity.User;
import org.hedgehogtech.testtask.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    public User createUser(User newUser) {
        User createdUser = userRepository.save(newUser);
        return createdUser;
    }

    public boolean findUserByName(String name) {
        Optional<User> user = userRepository.findByFirstName(name);
        if (user.isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    public User findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public List<User> findListOfUserContaining(String name) {
        List<User> users = userRepository.findByFirstNameContains(name);
        return users;
    }

}
