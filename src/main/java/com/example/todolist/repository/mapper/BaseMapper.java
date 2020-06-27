package com.example.todolist.repository.mapper;

public interface BaseMapper<S, R> {
    R convert(S source);
    S revert(R result);
}