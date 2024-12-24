package com.example.accessories_shop.web.mappers;

import com.example.accessories_shop.domain.user.User;
import com.example.accessories_shop.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);

}
