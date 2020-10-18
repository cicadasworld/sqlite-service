package com.jin.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.jin.tasks.domain.Task;

public interface TaskRepository extends JpaRepository<Task, String> {

    @Query("select t from Task t left join fetch t.subTasks")
    List<Task> findAllTask();

    @Query("select t from Task t left join fetch t.subTasks where t.taskId = :id")
    Task findTaskById(String id);
}
