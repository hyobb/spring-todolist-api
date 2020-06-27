package com.example.todolist.repository.mapper.implement;

import com.example.todolist.dto.User;
import com.example.todolist.repository.entity.UserVo;
import com.example.todolist.repository.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public User convert(UserVo source) {
        return User.builder()
                .id(source.getId())
                .email(source.getEmail())
                .password(source.getPassword())
                .build();
    }

    @Override
    public UserVo revert(User result) {
        return UserVo.builder()
                .id(result.getId())
                .email(result.getEmail())
                .password(result.getPassword())
                .build();
    }
}
