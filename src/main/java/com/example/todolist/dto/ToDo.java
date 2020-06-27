package com.example.todolist.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ToDo implements Serializable {
    Integer id;
    String title;
    String content;
    User user;
}
