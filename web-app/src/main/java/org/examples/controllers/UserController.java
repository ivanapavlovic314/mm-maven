package org.examples.controllers;

import org.example.domain.UserCommand;
import org.examples.entities.User;


public class UserController {

    User saveUser(UserCommand command) {
        //fake impl
        return new User();
    }
}
