package com.example.todolist.repository.dao;

import com.example.todolist.repository.entity.ToDoVo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoVo, Integer> {
}
