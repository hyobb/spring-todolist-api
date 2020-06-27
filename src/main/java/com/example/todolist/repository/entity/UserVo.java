package com.example.todolist.repository.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Builder
@Getter
@Setter
public class UserVo {
    @Id
    @Column
    Integer id;
    @Column
    String email;
    @Column
    String password;
}
