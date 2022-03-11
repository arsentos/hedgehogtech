package org.hedgehogtech.testtask.repository;

import org.hedgehogtech.testtask.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByFirstName(String firstName);
    List<User> findByFirstNameContains(String firstname);
}