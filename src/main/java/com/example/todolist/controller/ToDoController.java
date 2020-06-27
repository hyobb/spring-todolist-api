package com.example.todolist.controller;

import com.example.todolist.dto.ToDo;
import com.example.todolist.repository.entity.ToDoVo;
import com.example.todolist.service.ToDoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoController {

    ToDoService toDoService;

    public ToDoController(
            ToDoService toDoService
    ) {
        this.toDoService = toDoService;
    }

    @GetMapping(value = "test")
    public ResponseEntity helloWorld(
            @RequestParam("name") String name
    ) {
        return ResponseEntity.status(HttpStatus.OK).body("hello world" + " " + name);
    }

    @GetMapping(value = "/todos/{id}")
    public ResponseEntity getTodo(
        @PathVariable("id") Integer id
    ) {
        try {
            ToDo toDo = toDoService.getTodo(id);
            return ResponseEntity.status(HttpStatus.OK).body(toDo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }

    @PostMapping(value = "/todos")
    public ResponseEntity createToDos(
        @RequestBody ToDoVo toDoVo
    ) {
        try {
            toDoService.saveToDo(toDoVo);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
