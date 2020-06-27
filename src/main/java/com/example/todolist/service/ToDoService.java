package com.example.todolist.service;

import com.example.todolist.dto.ToDo;
import com.example.todolist.repository.dao.ToDoRepository;
import com.example.todolist.repository.entity.ToDoVo;
import com.example.todolist.repository.mapper.ToDoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service()
public class ToDoService {

    ToDoRepository toDoRepository;
    ToDoMapper toDoMapper;

    public ToDoService(
            ToDoRepository toDoRepository,
            ToDoMapper toDoMapper
    ) {
        this.toDoRepository = toDoRepository;
        this.toDoMapper = toDoMapper;
    }

    public void saveToDo(ToDoVo toDoVo) {
        toDoRepository.save(toDoVo);
    }


    public  ToDo getTodo(Integer id) {
        ToDoVo toDoVo = toDoRepository.getOne(id);
        ToDo toDo = toDoMapper.convert(toDoVo);
        return toDo;
    }

}