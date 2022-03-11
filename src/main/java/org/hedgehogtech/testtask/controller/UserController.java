package org.hedgehogtech.testtask.controller;

import lombok.AllArgsConstructor;
import org.hedgehogtech.testtask.entity.CheckUser;
import org.hedgehogtech.testtask.entity.DeleteUserRequest;
import org.hedgehogtech.testtask.entity.User;
import org.hedgehogtech.testtask.entity.UserListRequest;
import org.hedgehogtech.testtask.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/create")
    public User createNewUser(@RequestBody User newUser) {
        User createdUser = userService.createUser(newUser);
        return createdUser;
    }

    @GetMapping("/check-user")
    public String checkUser(@RequestBody CheckUser userRequest) {
        String name = userRequest.getName();
        boolean isUserExist = userService.findUserByName(name);
        if (isUserExist) {
            return "User " + name + " exists!";
        } else {
            return "There is no user with name " + name;
        }
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody DeleteUserRequest userRequest) {
        Long id = userRequest.getId();
        User user = userService.findUserById(id);
        if (user != null) {
            userService.deleteUser(user);
            return "User deleted";
        } else {
            return "There is no user with this ID";
        }
    }

    @GetMapping("/users")
    public List<User> findUserListByName(@RequestBody UserListRequest userRequest) {
        String name = userRequest.getName();
        List<User> users = userService.findListOfUserContaining(name);
        return users;
    }
}
