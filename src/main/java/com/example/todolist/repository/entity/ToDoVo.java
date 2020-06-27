package com.example.todolist.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table
public class ToDoVo {
    @Id
    @Column
    Integer id;
    @Column
    String title;
    @Column
    String content;
    @ManyToOne
    @JoinColumn
    UserVo user;
}
