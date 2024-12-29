package com.example.accessories_shop.web.mappers;

import com.example.accessories_shop.domain.user.User;
import com.example.accessories_shop.web.dto.user.UserDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);

}
