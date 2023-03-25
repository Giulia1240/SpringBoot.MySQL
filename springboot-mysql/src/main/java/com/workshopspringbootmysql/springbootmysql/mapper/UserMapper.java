package com.workshopspringbootmysql.springbootmysql.mapper;

import com.workshopspringbootmysql.springbootmysql.dto.UserDto;
import com.workshopspringbootmysql.springbootmysql.model.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
