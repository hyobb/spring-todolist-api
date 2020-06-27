package com.example.todolist.repository.mapper.implement;

import com.example.todolist.dto.ToDo;
import com.example.todolist.repository.entity.ToDoVo;
import com.example.todolist.repository.mapper.ToDoMapper;
import com.example.todolist.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToDoMapperImpl implements ToDoMapper {

    @Autowired
    UserMapper userMapper;

    @Override
    public ToDo convert(ToDoVo source) {
        return ToDo
                .builder()
                .id(source.getId())
                .title(source.getTitle())
                .content(source.getContent())
                .user(userMapper.convert(source.getUser()))
                .build();
    }

    @Override
    public ToDoVo revert(ToDo result) {
        return ToDoVo.builder()
                .id(result.getId())
                .title(result.getTitle())
                .content(result.getContent())
                .user(userMapper.revert(result.getUser()))
                .build();
    }
}
