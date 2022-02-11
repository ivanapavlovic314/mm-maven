package org.example.converters;

import org.example.domain.UserCommand;
import org.examples.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public  interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}