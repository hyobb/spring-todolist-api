package com.example.todolist.repository.dao;

import com.example.todolist.repository.entity.UserVo;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserVo, Integer> {
}
